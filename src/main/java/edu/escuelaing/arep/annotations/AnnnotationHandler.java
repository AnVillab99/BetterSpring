package edu.escuelaing.arep.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class AnnnotationHandler {

    private Method m;

    /**
     * StaticMethodHandler constructor.
     *
     * @param method represents the method of a class that has an annotation.
     */
    public AnnnotationHandler(Method method) {
        this.m = method;
    }

    /**
     * Process allows to execute the method that
     * this handler is keeping.
     *
     * @param methodArg represent the params of the method to handle.
     * @return String : the response of the method.
     */
    public String handle(String arg) {
        String ans = null;
        try {
            System.out.println("mehtod "+m+" args: "+arg);
            ans = (String) m.invoke(null, arg);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ans;
    }

    /**
     * Process allows to execute the method that
     * this handler is keeping.
     *
     * @return String : the response of the method.
     */
    public String handle() {
        String ans = null;
        System.out.println("mehtod "+m);
        try {
            ans = (String) m.invoke(null, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ans;
    }
}
