package com.example.esoftcompany.model;

import jakarta.persistence.*;

@Entity
@Table(name="living_complexes")
public class LivingComplex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id_complex;

    @Column(nullable=false, length=255)
    private String complex_name;

    @Column(nullable=false, length=255)
    private String complex_city;

    @Column(nullable=false, length=13)
    private String complex_status;

    @Column(nullable=false)
    private int complex_added_value_construction;

    @Column(nullable=false)
    private int complex_construction_costs;

    public LivingComplex(String complex_name, String complex_city, String complex_status,
                         int complex_added_value_construction, int complex_construction_costs) {
        this.complex_name = complex_name;
        this.complex_city = complex_city;
        this.complex_status = complex_status;
        this.complex_added_value_construction = complex_added_value_construction;
        this.complex_construction_costs = complex_construction_costs;
    }

    public int getId_complex() {
        return id_complex;
    }

    public void setId_complex(int id_complex) {
        this.id_complex = id_complex;
    }

    public String getComplex_name() {
        return complex_name;
    }

    public void setComplex_name(String complex_name) {
        this.complex_name = complex_name;
    }

    public String getComplex_city() {
        return complex_city;
    }

    public void setComplex_city(String complex_city) {
        this.complex_city = complex_city;
    }

    public String getComplex_status() {
        return complex_status;
    }

    public void setComplex_status(String complex_status) {
        this.complex_status = complex_status;
    }

    public int getComplex_added_value_construction() {
        return complex_added_value_construction;
    }

    public void setComplex_added_value_construction(int complex_added_value_construction) {
        this.complex_added_value_construction = complex_added_value_construction;
    }

    public int getComplex_construction_costs() {
        return complex_construction_costs;
    }

    public void setComplex_construction_costs(int complex_construction_costs) {
        this.complex_construction_costs = complex_construction_costs;
    }
}


