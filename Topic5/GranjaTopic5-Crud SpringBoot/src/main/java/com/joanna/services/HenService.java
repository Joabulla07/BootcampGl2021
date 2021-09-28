package com.joanna.services;

import com.joanna.Model.Egg;
import org.springframework.stereotype.Service;


public interface HenService {
     void layEggs();
     Egg[] handEgg();
}
