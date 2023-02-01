package com.deloitte.myproject.repository;

import com.deloitte.myproject.domain.Myresource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyresourceRepository extends JpaRepository<Myresource, Long> {
}