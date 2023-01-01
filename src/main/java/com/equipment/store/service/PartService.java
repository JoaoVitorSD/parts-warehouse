package com.equipment.store.service;

import com.equipment.store.entities.Part;
import com.equipment.store.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part/")
public class PartService {
    @Autowired
    private PartRepository partRepository;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("get/")
    public Part get(){
        return new Part("RE541922","ELEMENTO DO FILTRO",100,11,1);
    }
}
