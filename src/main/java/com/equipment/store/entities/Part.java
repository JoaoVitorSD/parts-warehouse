package com.equipment.store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "warehouse_parts")
public class Part {
    @Id
    private String id;

    private String description;
    private Integer warehouse;
    private Integer numberLocal;

    private Integer quantity;
}
