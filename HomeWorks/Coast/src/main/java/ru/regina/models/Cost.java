package ru.regina.models;

import javax.persistence.*;

@Entity
public class Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String description;

    @Column
    private double sum;

    public Cost(int id, String description, double sum) {
        this.id = id;
        this.description = description;
        this.sum = sum;
    }

    public Cost(String description, double sum) {
        this.description = description;
        this.sum = sum;
    }

    public Cost() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
