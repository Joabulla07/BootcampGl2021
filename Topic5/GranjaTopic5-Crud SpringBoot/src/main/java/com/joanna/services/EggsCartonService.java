package com.joanna.services;

import com.joanna.Model.Egg;

public interface EggsCartonService {
     boolean isFull();
     void addEgg(Egg egg);
     void updateFreePlace();
     void fullControl();
     void fillEmptyEggs();
}
