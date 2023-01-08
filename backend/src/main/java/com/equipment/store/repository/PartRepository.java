package com.equipment.store.repository;

import com.equipment.store.entities.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface PartRepository extends JpaRepository<Part,String> {
}
