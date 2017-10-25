/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PhongTroDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.PhongTro;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author nhattruong
 */
@MultipartConfig
public class UploadServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

// location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "images";

// upload settings
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;// 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

    private static String getValue(Part part) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream(), "UTF-8"));
        StringBuilder value = new StringBuilder();
        char[] buffer = new char[1024];
        for (int length = 0; (length = reader.read(buffer)) > 0;) {
            value.append(buffer, 0, length);
        }
        return value.toString();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

// checks if the request actually contains upload file
        if (!ServletFileUpload.isMultipartContent(request)) {
// if not, we stop here
            PrintWriter writer = response.getWriter();
            writer.println("Error: Form must has enctype=multipart/form-data.");
            writer.flush();
            return;
        }

        //configures upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();
// sets memory threshold - beyond which files are stored in disk 
        factory.setSizeThreshold(MEMORY_THRESHOLD);
// sets temporary location to store files
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);

// sets maximum size of upload file
        upload.setFileSizeMax(MAX_FILE_SIZE);

// sets maximum size of request (include file + form data)
        upload.setSizeMax(MAX_REQUEST_SIZE);

// constructs the directory path to store upload file
// this path is relative to application's directory
        String uploadPath = getServletContext().getRealPath("")
                + File.separator + UPLOAD_DIRECTORY;

// creates the directory if it does not exist
        File uploadDir = new File(uploadPath);
        String fileName = "";

        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {
// parses the request's content to extract file data
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);

            if (formItems != null && formItems.size() > 0) {
// iterates over form's fields
                for (FileItem item : formItems) {
// processes only fields that are not form fields
                    if (!item.isFormField()) {
                        fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);

                        // saves the file on disk
                        item.write(storeFile);
                        request.setAttribute("imgName", UPLOAD_DIRECTORY + "/" + fileName);
                        request.setAttribute("message",
                                "Upload has been done successfully >>" + UPLOAD_DIRECTORY + "/" + fileName);
                        
                    }
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "There was an error: " + ex.getMessage());
        }

// redirects client to message page
        getServletContext().getRequestDispatcher("/index.jsp").forward(
                request, response);

    }

}
