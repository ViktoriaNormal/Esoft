package com.example.esoftcompany.model;

import jakarta.persistence.*;

@Entity
@Table(name="houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id_house;

    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_complex")
    @Column(nullable=false)
    private LivingComplex complex;

    @Column(nullable=false, length=255)
    private String street;

    @Column(nullable=false, length=5)
    private String house_number;

    @Column(nullable=false)
    private int house_added_value_construction;

    @Column(nullable=false)
    private int house_construction_costs;

    public House(LivingComplex complex, String street, String house_number, int house_added_value_construction, int house_construction_costs) {
        this.complex = complex;
        this.street = street;
        this.house_number = house_number;
        this.house_added_value_construction = house_added_value_construction;
        this.house_construction_costs = house_construction_costs;
    }

    public int getId_house() {
        return id_house;
    }

    public void setId_house(int id_house) {
        this.id_house = id_house;
    }

    public LivingComplex getComplex() {
        return complex;
    }

    public void setComplex(LivingComplex complex) {
        this.complex = complex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public int getHouse_added_value_construction() {
        return house_added_value_construction;
    }

    public void setHouse_added_value_construction(int house_added_value_construction) {
        this.house_added_value_construction = house_added_value_construction;
    }

    public int getHouse_construction_costs() {
        return house_construction_costs;
    }

    public void setHouse_construction_costs(int house_construction_costs) {
        this.house_construction_costs = house_construction_costs;
    }
}

