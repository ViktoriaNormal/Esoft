package com.example.esoftcompany.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="apartments")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id_apartment;

    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_house")
    @Column(nullable=false)
    private House house;

    @Column(nullable=false)
    private int apartment_number;

    @Column(nullable=false)
    private int area;

    @Column(nullable=false)
    private int number_rooms;

    @Column(nullable=false)
    private int porch;

    @Column(nullable=false)
    private int floor;

    @Column(nullable=false, length=9)
    private String apartment_status;

    @Column(nullable=false)
    private int additional_cost_finishing;

    @Column(nullable=false)
    private int costs_finishing;

    public Apartment(House house, int apartment_number, int area, int number_rooms, int porch, int floor,
                     String apartment_status, int additional_cost_finishing, int costs_finishing) {
        this.house = house;
        this.apartment_number = apartment_number;
        this.area = area;
        this.number_rooms = number_rooms;
        this.porch = porch;
        this.floor = floor;
        this.apartment_status = apartment_status;
        this.additional_cost_finishing = additional_cost_finishing;
        this.costs_finishing = costs_finishing;
    }

    public int getId_apartment() {
        return id_apartment;
    }

    public void setId_apartment(int id_apartment) {
        this.id_apartment = id_apartment;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(int apartment_number) {
        this.apartment_number = apartment_number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumber_rooms() {
        return number_rooms;
    }

    public void setNumber_rooms(int number_rooms) {
        this.number_rooms = number_rooms;
    }

    public int getPorch() {
        return porch;
    }

    public void setPorch(int porch) {
        this.porch = porch;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getApartment_status() {
        return apartment_status;
    }

    public void setApartment_status(String apartment_status) {
        this.apartment_status = apartment_status;
    }

    public int getAdditional_cost_finishing() {
        return additional_cost_finishing;
    }

    public void setAdditional_cost_finishing(int additional_cost_finishing) {
        this.additional_cost_finishing = additional_cost_finishing;
    }

    public int getCosts_finishing() {
        return costs_finishing;
    }

    public void setCosts_finishing(int costs_finishing) {
        this.costs_finishing = costs_finishing;
    }
}


