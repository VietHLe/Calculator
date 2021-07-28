package com.example.calculator.Service;

import com.example.calculator.Model.CalculatorModel;
import com.example.calculator.Repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    @Autowired
    private CalculatorRepository calcRepository;

    public List<CalculatorModel> getAll(){
        return calcRepository.findAll();
    }
    public CalculatorModel create(CalculatorModel total){
        return calcRepository.save(total);
    }
    public CalculatorModel add(Long id, CalculatorModel plus){
        CalculatorModel total = calcRepository.findById(id).orElse(null);
        float oldTotal = total.getWant();
        float add = plus.getAdd();
        float newTotal = oldTotal + add;
        total.setWant(newTotal);
        return calcRepository.save(total);
    }
    public CalculatorModel sub(Long id, CalculatorModel subtract){
        CalculatorModel total = calcRepository.findById(id).orElse(null);
        float oldTotal = total.getWant();
        float sub = subtract.getSubtract();
        float newTotal = oldTotal - sub;
        total.setWant(newTotal);
        return calcRepository.save(total);
    }
    public CalculatorModel div(Long id, CalculatorModel divide){
        CalculatorModel total = calcRepository.findById(id).orElse(null);
        float oldTotal = total.getDivide();
        float newDiv = divide.getDivide();
        float newTotal = oldTotal / newDiv;
        total.setWant(newTotal);
        return calcRepository.save(total);
    }
    public CalculatorModel multi(Long id, CalculatorModel multiply){
        CalculatorModel total = calcRepository.findById(id).orElse(null);
        float oldTotal = total.getWant();
        float newMultiply = multiply.getMultiply();
        float newTotal = oldTotal * newMultiply;
        total.setWant(newTotal);
        return calcRepository.save(total);
    }
}
