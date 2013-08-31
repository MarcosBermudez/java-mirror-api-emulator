package com.google.api.services.mirror.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet used to Emulate an image datastore.
 * 
 * Get the image stored in your tmp folder.
 * 
 * @author Marcos Bermudez
 * 
 */
public class DownloadAttachementsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String filename = request.getPathInfo().substring(1);

        // You must tell the browser the file type you are going to send if you
        // have the information
        // for example image/jpg image/png ..
        File fileContent = new File(System.getProperty("java.io.tmpdir"), filename + ".contenttype");
        if (fileContent.exists()) {
            Scanner scanner = new Scanner(fileContent);
            String content = scanner.useDelimiter("\\Z").next();
            scanner.close();
            response.setContentType(content);
        }

        // using the File(parent, child) constructor for File class
        File file = new File(System.getProperty("java.io.tmpdir"), filename);
        // verify if the file exists
        if (file.exists()) {
            // move the code to download your file inside here...
            // This should send the file to browser
            OutputStream out = response.getOutputStream();
            FileInputStream in = new FileInputStream(file);
            byte[] buffer = new byte[4096];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.flush();
        } else {
            // handle a response to do nothing
        }
    }

}
