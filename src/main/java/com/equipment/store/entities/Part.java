package com.equipment.store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "warehouse_parts")
@Getter
@Setter
public class Part implements Serializable {
    private static final long serialVersionUID = 1L;
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
