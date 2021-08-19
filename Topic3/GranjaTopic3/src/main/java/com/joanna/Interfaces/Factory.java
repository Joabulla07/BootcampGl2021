package com.joanna.Interfaces;

import com.joanna.Enums.Color;
import com.joanna.Model.Hen;

public interface Factory {
    Hen factoryHen(Color color);
}
