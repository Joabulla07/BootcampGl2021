package com.joanna.Objects;


import com.joanna.Items.Color;
import lombok.*;


@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Egg {
        private Color color;

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

