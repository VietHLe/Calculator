package com.example.calculator.Repository;

import com.example.calculator.Model.CalculatorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends JpaRepository<CalculatorModel, Long> {
}
