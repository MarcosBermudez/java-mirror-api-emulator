package com.google.api.services.mirror.utils;

import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.mirror.Mirror;

/**
 * Utility class that centralize common tasks around the Mirror. 
 * 
 * @author bwnyasse
 */
public final class EmulatorUtil
{
	private static final Logger LOG = Logger.getLogger(EmulatorUtil.class.getSimpleName());
	
	private static final String APP_ENGINE_APPLICATION_URL = "app_engine_application_url";

	/**
	 * Retrieve the service definition for the Mirror.
	 *  
	 * @param credential
	 * 
	 * @param applicationName
	 * 
	 * @param appEngineApplicationURL
	 * 		the app. engine Application URL as https://<yourapp>.appspot.com
	 * 
	 * @return
	 * 	the service defintion for the Mirror.
	 */
	public static Mirror getMirror(Credential credential,String applicationName, String appEngineApplicationURL) {
		
		return getMirror(credential,applicationName,appEngineApplicationURL,new NetHttpTransport(),new JacksonFactory());
	}
	
	/**
	 * 
	 * Retrieve the service definition for the Mirror.
	 * 
	 * @param credential
	 * @param applicationName
	 * 
	 * @param appEngineApplicationURL
	 * 		the app. engine Application URL as https://<yourapp>.appspot.com
	 * 
	 * @param transport
	 * @param jsonFactory
	 * 
	 * @return
	 * 	the service defintion for the Mirror.
	 */
	public static Mirror getMirror(Credential credential,String applicationName, String appEngineApplicationURL,com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory) {
		   setAppEngineApplicationURL(appEngineApplicationURL);  
		   return new Mirror.Builder(transport,jsonFactory, credential)
	       .setApplicationName(applicationName).build();
	}
	
	/**
	 * Method to specify the app engine application url.
	 * 
	 * @param appURL
	 * 	 the app engine url as https://<yourapp>.appspot.com
	 */
	private static final void setAppEngineApplicationURL(String appURL)
	{
		
		if (StringUtils.isNotBlank(appURL))
		{
			String rootURL = appURL +"/_ah/api/";
			if(System.getProperty(APP_ENGINE_APPLICATION_URL) != rootURL){
				System.setProperty(APP_ENGINE_APPLICATION_URL, rootURL);
			}
		}
		else
		{
			LOG.severe("Something went wrong when adding you app engine application URL");
			throw new RuntimeException("Unable to set your app engine application URL.");
		}
	}
	
	/**
	 * Method to retrieve the app engine application url.
	 * 
	 * @return appURL
	 * 	 the app engine url as https://<yourapp>.appspot.com
	 */
	public static final String getAppEngineApplicationURL()
	{
		String appURL = System.getProperty(APP_ENGINE_APPLICATION_URL);

		if (StringUtils.isNotBlank(appURL))
		{
			return appURL;
		}
		else
		{
			LOG.severe("Something went wrong with you app engine application URL");
			throw new RuntimeException("Unable to get your app engine application URL.  "
					+ "Might be forget to add the url in the system properties.");
		}			

	}

}
