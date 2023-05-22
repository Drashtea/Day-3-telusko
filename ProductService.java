package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;



    public List<Product> getAllProducts(){

        return db.findAll();
    }

    public Product getProduct(String name){
        for(Product p : products){
           
                return db.findByName(String name);
        }
    }
    
    public Product getProduct(int year){
        for(Product p : products){
           
                return db.findBywarranty(int year);
        }
    }
    
    public Product getProduct(String place){
        for(Product p : products){
           
                return db.findByPlace(String place);
        }
    }


}
