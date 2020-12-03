
package mx.uv;

import static spark.Spark.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
public class App
{
    public static void main( String[] args )
    {
        staticFiles.location("/public");
        get("/hola", (req, res) -> {
            Map<String, Object> modelo = new HashMap<>();
            Date fecha = new Date();
            modelo.put("fecha", fecha);
            
            modelo.put("personita", new Persona("Equipo 3"));
            return new ModelAndView(modelo, "index.vm");
        }, new VelocityTemplateEngine());
    }
}