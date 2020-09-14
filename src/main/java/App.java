import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Hero;
//import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;


public class App{
    public static void main(String[] args) {
        staticFileLocation("/public");

        post("/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squad/new",(request,response) ->{
            Map<String,Object> model = new HashMap<>();
            Hero newHero = new Hero(content);
            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());
    }

}