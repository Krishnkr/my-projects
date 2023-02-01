package com.deloitte.myproject.controller;

import com.deloitte.myproject.domain.Myresource;
import com.deloitte.myproject.service.MyresourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class MyresourceController {


    @Autowired
    private MyresourceService myresourceService;

    @GetMapping("/myresources")
    public List<Myresource> getMyresources() {
        return myresourceService.getMyresources();
    }

    @GetMapping("/myresource/{id}")
    public Myresource getMyresourceById(@PathVariable Long id) {
        return myresourceService.getMyresourceById(id);
    }

    @PostMapping("/myresource")
    public Myresource saveMyresource(@RequestBody Myresource myresource) {
        return myresourceService.saveMyresource(myresource);
    }

    @PutMapping("/myresource/{id}")
    public Myresource updateMyresource(@PathVariable Long id, @RequestBody Myresource myresource) {
        return myresourceService.updateMyresource(id, myresource);
    }

    @DeleteMapping("/myresource/{id}")
    public void deleteMyresource(@PathVariable Long id) {
        myresourceService.deleteMyresourceById(id);
    }
}
