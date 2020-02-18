package hu.uni.eszterhazy.frameworks;

import hu.uni.eszterhazy.frameworks.model.Actor;
import hu.uni.eszterhazy.frameworks.service.ActorSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping(value = {"/actor"})
public class ActorsController {

    @Autowired
    private ActorSearchService actorSearchService;



    @RequestMapping(value={"/all","/mind"}, method = RequestMethod.GET)
    public Collection<Actor> fetchAllActors(){
        return actorSearchService.listActors();
    }
//saját próba kód
    @RequestMapping(value={"/proba"}, method = RequestMethod.GET)
    public Collection<Actor> fetchAllActorsproba(){
        return actorSearchService.listActors();
    }


    //eddig

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return String.format("Hello %s", name);
    }
    @RequestMapping(value = "/hello/{name}")
    public String sayHellofor(@PathVariable("name") String name){
            return String.format("Hy %s",name);
        }

}