package com.example.api.prodcut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdcutService {

    @Autowired
    ProdcutRepository repository;

    public Prodcut  Save(Prodcut prodcut){
        return repository.save(prodcut);
    }

    public List<Prodcut> FindAll(){
        return repository.findAll();
    }

}
