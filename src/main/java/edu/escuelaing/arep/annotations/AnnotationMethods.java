package edu.escuelaing.arep.annotations;

/**
 * Web Service allows to developers create new functions for their
 * web application.
 */
public class AnnotationMethods {

    @Web("hola")
    public static String hola(String name) {
        return "<html>" +
                "<head>" +
                "<title>Hola</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hola</h1>" +
                "<div>Hola, "+name+" hoy es un buen dia</div>" +
                "</body>" +
                "</html>";
    }

    @Web("hello")
    public static String hello() {
        return "<html>" +
                "<head>" +
                "<title>Hello</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hello</h1>" +
                "<div>Hello desconcocido</div>" +
                "</body>" +
                "</html>";
    }
}
