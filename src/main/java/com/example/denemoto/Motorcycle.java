package com.example.denemoto;

import javax.persistence.*;

@Entity
@Table(name = "motor")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String model;
    private double motoprice;
    private String color;
    public Motorcycle() {
    }
    public Motorcycle(String name, String model, double motoprice, String color) {
        this.name = name;
        this.model = model;
        this.motoprice = motoprice;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getMotoprice() {
        return motoprice;
    }
    public long getId() {
        return id;
    }
}
