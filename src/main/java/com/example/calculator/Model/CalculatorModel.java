package com.example.calculator.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CalculatorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float want = 0;
    private float multiply = 0;
    private float add = 0;
    private float subtract = 0;
    private float divide = 0;
}
