package com.example.esoftcompany.model;

import com.example.esoftcompany.container.LivingComplexContainer;
import com.example.esoftcompany.dao.LivingComplexDao;
import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

import java.util.List;

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

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_complex")
    private List<House> houses;

    public LivingComplex() {}

    public LivingComplex(String complex_name, String complex_city, String complex_status,
                         int complex_added_value_construction, int complex_construction_costs) {
        this.complex_name = complex_name;
        this.complex_city = complex_city;
        this.complex_status = complex_status;
        this.complex_added_value_construction = complex_added_value_construction;
        this.complex_construction_costs = complex_construction_costs;
    }

    public int getCounter() {
        return houses.size();
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

    public int complexHouses() {
        LivingComplexDao livingComplexDao = new LivingComplexDao();
        return livingComplexDao.counterHousesByComplex(this);
    }
}



//package com.example.esoftcompany.model;
//
//import com.example.esoftcompany.dao.LivingComplexDao;
//import jakarta.persistence.*;
//import javafx.beans.property.*;
//
//@Entity
//@Table(name="living_complexes")
//public class LivingComplex {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(unique=true, nullable=false)
//    private final IntegerProperty id_complex = new SimpleIntegerProperty();
//
//    @Column(nullable=false, length=255)
//    private final StringProperty complex_name =  new SimpleStringProperty();
//
//    @Column(nullable=false, length=255)
//    private final StringProperty complex_city = new SimpleStringProperty();
//
//    @Column(nullable=false, length=13)
//    private final StringProperty complex_status = new SimpleStringProperty();
//
//    @Column(nullable=false)
//    private final IntegerProperty complex_added_value_construction = new SimpleIntegerProperty();
//
//    @Column(nullable=false)
//    private final IntegerProperty complex_construction_costs = new SimpleIntegerProperty();
//
//    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
//    @JoinColumn(name = "id_complex")
//    private final ListProperty<House> houses = new SimpleListProperty<>();
//
//    public LivingComplex() {}
//
//    public LivingComplex(String complex_name, String complex_city, String complex_status,
//                         int complex_added_value_construction, int complex_construction_costs) {
//        setComplex_name(complex_name);
//        setComplex_city(complex_city);
//        setComplex_status(complex_status);
//        setComplex_added_value_construction(complex_added_value_construction);
//        setComplex_construction_costs(complex_construction_costs);
//    }
//
//    public final IntegerProperty getCounterProperty() {
//        IntegerProperty counter = new SimpleIntegerProperty();
//        counter.set(houses.size());
//        return counter;
//    }
//
//    public final IntegerProperty id_complexProperty() {
//        return this.id_complex;
//    }
//
//    public int getId_complex() {
//        return this.id_complex.get();
//    }
//
//    public void setId_complex(int id_complex) {
//        this.id_complex.set(id_complex);
//    }
//
//    public final StringProperty complex_nameProperty() {
//        return this.complex_name;
//    }
//
//    public String getComplex_name() {
//        return this.complex_name.get();
//    }
//
//    public void setComplex_name(String complex_name) {
//        this.complex_name.set(complex_name);
//    }
//
//    public StringProperty complex_cityProperty() {
//        return this.complex_city;
//    }
//
//    public String getComplex_city() {
//        return this.complex_city.get();
//    }
//
//    public void setComplex_city(String complex_city) {
//        this.complex_city.set(complex_city);
//    }
//
//    public StringProperty complex_statusProperty() {
//        return this.complex_status;
//    }
//
//    public String getComplex_status() {
//        return this.complex_status.get();
//    }
//
//    public void setComplex_status(String complex_status) {
//        this.complex_status.set(complex_status);
//    }
//
//    public IntegerProperty complex_added_value_constructionProperty () {
//        return this.complex_added_value_construction;
//    }
//
//    public int getComplex_added_value_construction() {
//        return this.complex_added_value_construction.get();
//    }
//
//    public void setComplex_added_value_construction(int complex_added_value_construction) {
//        this.complex_added_value_construction.set(complex_added_value_construction);
//    }
//
//    public IntegerProperty complex_construction_costsProperty () {
//        return this.complex_construction_costs;
//    }
//
//    public int getComplex_construction_costs() {
//        return this.complex_construction_costs.get();
//    }
//
//    public void setComplex_construction_costs(int complex_construction_costs) {
//        this.complex_construction_costs.set(complex_construction_costs);
//    }
//
//    public int complexHouses() {
//        LivingComplexDao livingComplexDao = new LivingComplexDao();
//        return livingComplexDao.counterHousesByComplex(this);
//    }
//}
//
//
