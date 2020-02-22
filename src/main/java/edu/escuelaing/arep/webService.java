package edu.escuelaing.arep;

import edu.escuelaing.arep.annotations.Web;

public class webService {


    @Web
    public static String Hello(){
        return "<!DOCTYPE html> <html>"+
        "<head>"+
        "</head>"+
        "<body>"+
        "<h1>Index</h1>"+
        "   <h3>This is the index</h3>"+
        "</body>"+
        "</html>";

    }

}