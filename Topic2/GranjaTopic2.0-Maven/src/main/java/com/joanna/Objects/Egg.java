package com.joanna.Objects;


import com.joanna.Items.Color;

public class Egg {
        private Color color;

        public Egg(){ }

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
    }

