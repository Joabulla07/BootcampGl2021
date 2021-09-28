package com.joanna.services;

import com.joanna.Model.Hen;

public interface FarmerService {
    public void startFarming(Hen[] hens);
    public void initEggsCartons();
    public void showEggsCartons();
}
