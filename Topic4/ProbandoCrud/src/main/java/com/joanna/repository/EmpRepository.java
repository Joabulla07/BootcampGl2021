package com.joanna.repository;

import com.joanna.model.Empleado;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpRepository {
    public Empleado getEmpById(int id);
    public List<Empleado> getEmployees();
}
