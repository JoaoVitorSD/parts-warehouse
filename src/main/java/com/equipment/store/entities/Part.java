package com.equipment.store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "warehouse_parts")
@Getter
@Setter
public class Part {
    @Id
    private String id;

    private String description;
    private Integer warehouse;
    private Integer numberLocal;

    private Integer quantity;

    public Part() {};
    public Part(String id, String description, Integer warehouse, Integer numberLocal, Integer quantity) {
        this.id = id;
        this.description = description;
        this.warehouse = warehouse;
        this.numberLocal = numberLocal;
        this.quantity = quantity;
    }


}
