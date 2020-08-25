package ru.job4j;

import org.apache.poi.hsmf.MAPIMessage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MSGService extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MAPIMessage email = new MAPIMessage(req.getPart("file").);
    }
}
