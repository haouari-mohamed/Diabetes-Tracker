package com.repository;

import com.entity.glycemie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiabeteRepository extends JpaRepository<glycemie, Integer> {

}