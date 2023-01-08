package com.equipment.store.service;

import com.equipment.store.entities.Part;
import com.equipment.store.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/part/")
@CrossOrigin
public class PartService {
    @Autowired
    private PartRepository partRepository;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("get/")
    public List<Part> get(){
        return partRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/insert")
    public Part insert(@RequestBody Part part){
        partRepository.save(part);
        return part;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/getAll")
    public List<Part> getAll(){
        return partRepository.findAll();
    }
}
