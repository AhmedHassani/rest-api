package com.example.api.prodcut;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProdcutService service;

     @GetMapping(value = {"/",""})
     public String Hello(){
             return "Test REST API";
     }

    @GetMapping(value = {"/user"})
    public List<Prodcut> getUser(){
        return service.FindAll();
    }

    @GetMapping(value = {"/inuser"})
    public Prodcut SaveUser(){
         Prodcut prodcut =new Prodcut("ns",44);
         return service.Save(prodcut);
    }


}
