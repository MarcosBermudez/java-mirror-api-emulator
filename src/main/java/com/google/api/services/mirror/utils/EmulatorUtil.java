package com.google.api.services.mirror.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.mirror.Mirror;
import com.google.api.services.mirror.model.TimelineItem;

/**
 * Utility class that centralize common tasks around the Mirror.
 * 
 * @author bwnyasse
 * @author Marcos Bermudez
 */
public final class EmulatorUtil {
    private static final Logger LOG = Logger.getLogger(EmulatorUtil.class.getSimpleName());

    private static final String APP_ENGINE_APPLICATION_URL = "app_engine_application_url";

    private static String glasswareHost = "http://localhost:8080";

    /**
     * Retrieve the service definition for the Mirror.
     * 
     * @param credential
     * 
     * @param applicationName
     * 
     * @param appEngineApplicationURL the app. engine Application URL as https://<yourapp>.appspot.com
     * 
     * @return the service defintion for the Mirror.
     */
    public static Mirror getMirror(Credential credential, String applicationName, String appEngineApplicationURL) {

        return getMirror(credential, applicationName, appEngineApplicationURL, new NetHttpTransport(),
                new JacksonFactory());
    }

    /**
     * 
     * Retrieve the service definition for the Mirror.
     * 
     * @param credential
     * @param applicationName
     * 
     * @param appEngineApplicationURL the app. engine Application URL as https://<yourapp>.appspot.com
     * 
     * @param transport
     * @param jsonFactory
     * 
     * @return the service defintion for the Mirror.
     */
    public static Mirror getMirror(Credential credential, String applicationName, String appEngineApplicationURL,
            com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory) {
        setAppEngineApplicationURL(appEngineApplicationURL);
        return new Mirror.Builder(transport, jsonFactory, credential).setApplicationName(applicationName).build();
    }

    /**
     * Method to specify the app engine application url.
     * 
     * @param appURL the app engine url as https://<yourapp>.appspot.com
     */
    private static final void setAppEngineApplicationURL(String appURL) {

        if (StringUtils.isNotBlank(appURL)) {
            String rootURL = appURL + "/_ah/api/";
            if (System.getProperty(APP_ENGINE_APPLICATION_URL) != rootURL) {
                System.setProperty(APP_ENGINE_APPLICATION_URL, rootURL);
            }
        } else {
            LOG.severe("Something went wrong when adding you app engine application URL");
            throw new RuntimeException("Unable to set your app engine application URL.");
        }
    }

    /**
     * Method to retrieve the app engine application url.
     * 
     * @return appURL the app engine url as https://<yourapp>.appspot.com
     */
    public static final String getAppEngineApplicationURL() {
        String appURL = System.getProperty(APP_ENGINE_APPLICATION_URL);

        if (StringUtils.isNotBlank(appURL)) {
            return appURL;
        } else {
            LOG.severe("Something went wrong with you app engine application URL");
            throw new RuntimeException("Unable to get your app engine application URL.  "
                    + "Might be forget to add the url in the system properties.");
        }

    }

    /**
     * The real Mirror API supports Multipart-bodies to attach images to cards, Emulator not, we will transformt the
     * card in one HTML TimeLineItem. https://github.com/Scarygami/mirror-api - REAMDME.md
     * 
     * @param content The initial timeline item.
     * @param mediaContent The attachement image.
     * @return The initial timeline item modified to look like one HTML card with the atachement.
     * @throws IOException
     * @throws FileNotFoundException
     */

    public static TimelineItem createTimeLineItemWithAtachement(TimelineItem content,
            AbstractInputStreamContent mediaContent) throws IOException, FileNotFoundException {

        // We are going to transform the card in one HTML card.
        if (content.getHtml() != null && content.getHtml().isEmpty()) {
            // If the card already contains html then we do nothing
            LOG.log(Level.WARNING,
                    "Emulation limitation : Images are transformes in HTML card, you must choose, or HTML or Attachement. your attachement will be ignored. ");
        } else {
            // Store the image
            String attachementURL = storeAttachement(mediaContent);

            // Transform card in one HTML card
            String cardText = content.getText() != null ? content.getText() : "";
            String html = "<article class=\"photo\">  <img src="
                    + attachementURL
                    + " width=\"100%\" height=\"100%\">  <div class=\"photo-overlay\"></div>  <section>    <p class=\"text-auto-size\">"
                    + cardText + "</p>  </section></article>";
            content.setHtml(html);
        }
        return content;
    }

    /**
     * Transform attachement in one local URL
     * 
     * @param mediaContent the attachement to transform into URL
     * @return The attachement return URL
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static String storeAttachement(com.google.api.client.http.AbstractInputStreamContent mediaContent)
            throws IOException, FileNotFoundException {

        // Write the file content
        File file = File.createTempFile("img", ".tmp");
        FileOutputStream os = new FileOutputStream(file);
        mediaContent.writeTo(os);
        os.close();
        String filename = file.getName();
        file.deleteOnExit();

        // Write the media type
        if (mediaContent.getType() != null) {
            File fileContentType = new File(file.getPath() + ".contenttype");
            FileWriter fileWriter = new FileWriter(fileContentType, false);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(mediaContent.getType());
            bw.close();
            fileContentType.deleteOnExit();
        }

        String imgSrc = "\"" + glasswareHost + "/attachements/" + filename + "\"";
        return imgSrc;
    }

    /**
     * @return The glass ware application Host by default http://localhost:8080
     */
    public static String getGlasswareHost() {
        return glasswareHost;
    }

    /**
     * Sets the glass ware application Host by default http://localhost:8080
     * 
     * @param glasswareHost the new Host.
     */
    public static void setGlasswareHost(String glasswareHost) {
        // Control that the host do not finish with /
        EmulatorUtil.glasswareHost = glasswareHost.endsWith("/") ? glasswareHost.substring(0,
                glasswareHost.length() - 1) : glasswareHost;
    }

}
