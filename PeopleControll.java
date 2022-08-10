package com.example.w2d3lap2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleControll {
    ArrayList<String>name=new ArrayList<>();


    @GetMapping("/name")
    public  ArrayList getname (){

        return name;

    }

    @PostMapping("/name")
    public String addnamee(@RequestBody String namee){
        name.add(namee);
        return "addname";

    }


    @PutMapping("/name/{index}")
    public String updatename( @PathVariable int index,@RequestBody String namee){
        name.set(index,namee);
        return "updated name ";
    }

    @RequestMapping("/name/{index}")

     public String deletename(@PathVariable int index){
        name.remove(index);
        return "remove name";

}



}
