package mx.uv;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/hola", (req, res) -> {
            Map<String, Object> modelo = new HashMap<>();
            modelo.put("hola", "Mundo de Velocity");
            modelo.put("personita", new Persona("Yoop"));
            return new ModelAndView(modelo, "index.vm");
        }, new VelocityTemplateEngine());
    }
}
