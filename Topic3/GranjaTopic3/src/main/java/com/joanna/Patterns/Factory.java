package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Hen;

public interface Factory {
    Hen factoryHen(Color color);
}
