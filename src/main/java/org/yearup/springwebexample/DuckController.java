package org.yearup.springwebexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuckController {

    List<Duck> ducks = new ArrayList<>();

    DuckController(){
        ducks.add(new Duck("Benny", false, 67.0));
        ducks.add(new Duck("Patsy", true, 23.0));
        ducks.add(new Duck("Penny", false, 47.0));
    }

    @GetMapping("/ducks/penny")
    Duck getMyDuck(){
        return ducks.get(2);

    }

    @GetMapping("/ducks")
    List<Duck> allMyDucks(){
        return ducks;
    }

}
