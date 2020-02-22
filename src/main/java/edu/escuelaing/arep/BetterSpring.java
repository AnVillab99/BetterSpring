package edu.escuelaing.arep;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.escuelaing.arep.annotations.Web;

/**
 * Hello world!
 *
 */
public class BetterSpring {
    public static void main(String[] args) {
        String className = "edu.escuelaing.arep.webService";
        try {
            Class c = Class.forName(className);
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(Web.class)) {
                    System.out.println("llamando metodo " + m.getName());
                    System.out.println(m.invoke(null));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
