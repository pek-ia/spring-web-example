package org.yearup.springwebexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ducks")
public class DuckController {

    Map<String, Duck> ducks = new HashMap();

    DuckController(){
        ducks.put("Benny", new Duck("Benny", false, 67.0));
        ducks.put("Patsy", new Duck("Patsy", true, 23.0));
        ducks.put("Penny", new Duck("Penny", false, 47.0));
    }

    @GetMapping("/{name}")

    Duck getMyDuck( @PathVariable("name") String name){
        return ducks.get(name);

    }

    @GetMapping("")
    List<Duck> allMyDucks(){
        return ducks.values().stream().toList();
    }

}
