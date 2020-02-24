package edu.escuelaing.arep;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    private static webServer ws;

    public static void main(String[] args) throws IOException
    {
        ws = new webServer();
        ws.checkAnnotations();
        ws.start();
        
    }
}
