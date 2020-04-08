package com.example.api.prodcut;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdcutRepository extends MongoRepository<Prodcut, String> {

}
