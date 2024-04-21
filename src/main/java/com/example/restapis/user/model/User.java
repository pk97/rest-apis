package com.example.restapis.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record User(@Id int id, String name, int age) {

    @Override
    public String toString() {
        return name;
    }
}
