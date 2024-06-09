package com.service;

import com.entity.glycemie;
import com.repository.DiabeteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DiabeteServiceImpl {

    @Autowired
    private DiabeteRepository repo;


    public List<glycemie> getDiabetes() {
        return repo.findAll();
    }

    public void saveDiabete(glycemie theDiabete) {
        glycemie diabete = repo.save(theDiabete);
    }

    public glycemie getDiabete(int id) {
        Optional<glycemie> result = repo.findById(id);
        glycemie theDiabete = null;
        if (result.isPresent()) {
            theDiabete = result.get();
        } else {
            throw new RuntimeException("Did not find diabete id - " + id);
        }
        return theDiabete;
    }

    public void deleteDiabete(int id) {
        repo.deleteById(id);
    }
}
