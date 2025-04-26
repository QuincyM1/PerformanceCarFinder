package com.performancecarsfinder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity  // ✅ Marks this class as a database entity
@Table(name = "modifications")  // ✅ Specifies the table name
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String brand;
    private int powerGain;
    private double cost;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    @JsonBackReference  // <<< IMPORTANT: BackReference here
    private Car car;

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPowerGain() {
        return powerGain;
    }

    public void setPowerGain(int powerGain) {
        this.powerGain = powerGain;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
