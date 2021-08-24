package com.joanna.Interfaces;

import com.joanna.constants.Color;
import com.joanna.Model.Hen;
import org.springframework.stereotype.Service;

@Service
public interface HFactory {
   Hen factoryHen(String color);
}
