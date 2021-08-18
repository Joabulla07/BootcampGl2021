package com.joanna.Objects;


import com.joanna.Items.Color;

import java.util.Objects;

public class Egg {
        private Color color;

        public Egg(Color color){
            this.color = color;
        }

        public Color getColor(){
            return this.color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

    @Override
        public String toString() {

            String eggStr;
            if(this.color==Color.RED){
                eggStr="(D)";
            }else if(this.color==Color.WHITE){
                eggStr="(O)";
            }else{
                eggStr="(G)";
            }
            return eggStr;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Egg egg = (Egg) o;
        return color == egg.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

