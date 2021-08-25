package com.joanna.farm.Interfaces;


import com.joanna.farm.models.Hen;
import org.springframework.stereotype.Service;

@Service
public interface HFactory {
   Hen factoryHen(String color);
}
