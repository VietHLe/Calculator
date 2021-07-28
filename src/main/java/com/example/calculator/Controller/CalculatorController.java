package com.example.calculator.Controller;

import com.example.calculator.Model.CalculatorModel;
import com.example.calculator.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    @Autowired
    private CalculatorService calcRepository;

    @PostMapping("calculate")
    public CalculatorModel create(@RequestBody CalculatorModel total){
        return calcRepository.create(total);
    }
    @PutMapping("calculate/{id}/add")
    public CalculatorModel add(@PathVariable Long id,@RequestBody CalculatorModel add){
        return calcRepository.add(id,add);
    }
    @PutMapping("calculate/{id}/subtract")
    public CalculatorModel sub(@PathVariable Long id, @RequestBody CalculatorModel sub){
        return calcRepository.sub(id,sub);
    }
    @PutMapping("calculate/{id}/multiply")
    public CalculatorModel multi(@PathVariable Long id, @RequestBody CalculatorModel multi){
        return calcRepository.multi(id,multi);
    }
    @PutMapping("calculate/{id}/divide")
    public CalculatorModel div(@PathVariable Long id, @RequestBody CalculatorModel divide){
        return calcRepository.div(id,divide);
    }

}
