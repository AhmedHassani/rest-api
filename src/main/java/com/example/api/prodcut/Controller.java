package com.example.api.prodcut;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

     @GetMapping(value = {"/",""})
     public String Hello(){
             return "Test REST API";
     }


}
