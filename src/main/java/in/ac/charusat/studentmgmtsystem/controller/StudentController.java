package in.ac.charusat.studentmgmtsystem.controller;


import org.springframework.web.bind.annotation.*;



@RestController

public class StudentController {


    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }

}
