package co.edu.escuelaing.sparkdockerdemolive;

import co.edu.escuelaing.sparkdockerdemolive.service.Operators;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        staticFiles.location("/public");
        get("/sin/:num", (req,res) -> Operators.sin(Double.parseDouble(req.params(":num"))));
        get("/cos/:num", (req,res) -> Operators.cos(Double.parseDouble(req.params(":num"))));
        get("/palindome/:word", (req,res) -> Operators.isPalindom(req.params(":word")));
        get("/magnitud/:x/:y", (req,res) -> Operators.magnitud(Double.parseDouble(req.params(":x")), Double.parseDouble(req.params(":y"))));
    }

    /**
     * Método que pone un puerto del servicio
     * @return puerto del servicio que se va a correr
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}