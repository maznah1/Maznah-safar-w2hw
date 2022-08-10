package com.example.w2dlap3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


    @RestController
    public class GradeController {
        ArrayList<String> grade = new ArrayList<>();


        @GetMapping("/grade")
        public ArrayList getgrade() {

            return grade;

        }

        @PostMapping("/grade")
        public String addgrade(@RequestBody String gradee) {
            grade.add(gradee);
            return "add grade";

        }


        @PutMapping("/grade/{index}")
        public String updatgrade(@PathVariable int index, @RequestBody String gradee) {
            grade.set(index, gradee);
            return "updatgrade";
        }

        @RequestMapping("/name/{index}")

        public String deletegrade(@PathVariable int index) {
            grade.remove(index);
            return "deletgrade";

        }
    }