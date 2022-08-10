package com.example.w2hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/hey")
    public String gethey(){

        return "Hey from spring";
    }
    @RequestMapping(path = "/bye/check/status",method = RequestMethod.GET)

    public String getbye(){

        return "Everything OK";

    }

    @GetMapping("/heslth")
    public String gethealth(){

        return "Server health is up and running";
    }



}
