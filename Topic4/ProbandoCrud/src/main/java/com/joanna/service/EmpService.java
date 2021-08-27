package com.joanna.service;

import com.joanna.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {
    public int save(Empleado p);
    public int update(Empleado p);
    public int delete(int id);

}
