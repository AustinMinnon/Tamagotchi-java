import java.util.HashMap;
import java.util.ArrayList;


import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("tamagotchis", request.session().attribute("tamagotchis"));

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/tamagotchis", (request, response) -> {
     HashMap<String, Object> model = new HashMap<String, Object>();

    ArrayList<Tamagotchi> tamagotchis = request.session().attribute("tamagotchis");

    if (tamagotchis == null) {
      tamagotchis = new ArrayList<Tamagotchi>();
      request.session().attribute("tamagotchis", tamagotchis);
    }

     String name = request.queryParams("name");
     Tamagotchi newTamagotchi = new Tamagotchi(name);

     tamagotchis.add(newTamagotchi);
     model.put("name", name);


     model.put("template", "templates/tamagotchi.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());
  }
}
