package edu.escuelaing.arep;

import java.io.IOException;

/**
 * Clase principal
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
