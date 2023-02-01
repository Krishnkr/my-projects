package com.deloitte.myproject.service;

import com.deloitte.myproject.domain.Myresource;
import java.util.List;

public interface MyresourceService {

    Myresource saveMyresource(Myresource myresource);
    Myresource updateMyresource(Long id, Myresource myresource);
    void deleteMyresourceById(Long id);
    List<Myresource> getMyresources();
    Myresource getMyresourceById(Long id);

}