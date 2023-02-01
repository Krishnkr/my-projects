package com.deloitte.myproject.service.serviceImpl;

import com.deloitte.myproject.domain.Myresource;
import com.deloitte.myproject.repository.MyresourceRepository;
import com.deloitte.myproject.service.MyresourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@Service
public class MyresourceServiceImpl implements MyresourceService {


    @Autowired
    MyresourceRepository myresourceRepository;

    @Override
    public Myresource saveMyresource(Myresource myresource) {
        return myresourceRepository.save(myresource);
    }

    @Override
    public Myresource updateMyresource(Long id, Myresource myresource) {
        Myresource myresourceObj = myresourceRepository.findById(id).get();
        //update the required fields
        return myresourceRepository.save(myresourceObj);
    }

    @Override
    public void deleteMyresourceById(Long id) {
        myresourceRepository.deleteById(id);
    }

    @Override
    public List<Myresource>getMyresources() {
        return myresourceRepository.findAll();
    }

    @Override
    public Myresource getMyresourceById(Long id) {
        return myresourceRepository.findById(id).get();
    }
}