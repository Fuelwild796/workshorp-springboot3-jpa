package com.educandoweb.demo.resources;

import com.educandoweb.demo.entities.Category;
import com.educandoweb.demo.entities.Order;
import com.educandoweb.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryResouce {

    @Autowired
    private CategoryService Service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = Service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = Service.findById(id);
        return  ResponseEntity.ok().body(obj);
    }



}
