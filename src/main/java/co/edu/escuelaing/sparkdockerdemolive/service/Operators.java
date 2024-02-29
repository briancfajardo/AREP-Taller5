package co.edu.escuelaing.sparkdockerdemolive.service;

import static java.lang.Math.toRadians;

public class Operators {
    /**
     * Método que calcula el seno de un número
     * @param num número al  que se le va a calcular el seno
     * @return seno
     */
    public static double sin(double num){
        return Math.sin(toRadians(num));
    }

    /**
     * Método que calcula el coseno de un número
     * @param num número del que se quiere saber el coseno
     * @return double coseno calculado
     */
    public static double cos(double num){
        return Math.cos(toRadians(num));
    }

    /**
     * Método que valida si una palabra es palindoma
     * @param palabra palabra que se desea saber si es palindroma
     * @return booleano que responde a la pregunta inicial
     */
    public static boolean isPalindom(String palabra){
        StringBuilder rev = new StringBuilder();

        boolean ans = false;

        for (int i = palabra.length() - 1; i >= 0; i--) {
            rev.append(palabra.charAt(i));
        }

        if (palabra.contentEquals(rev)) {
            ans = true;
        }
        return ans;
    }

    /**
     * Método que calcula la magnitud de dos número reales
     * @param num1 número real 1
     * @param num2 número real 2
     * @return
     */
    public static  double magnitud(double num1, double num2){
        double sum = 0;

        sum+= Math.pow(num1, 2);
        sum+= Math.pow(num2, 2);

        return Math.sqrt(sum);
    }
}
