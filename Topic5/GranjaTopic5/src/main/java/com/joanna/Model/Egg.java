package com.joanna.Model;


import com.joanna.constants.Color;
import lombok.*;
import org.springframework.stereotype.Component;


@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Component("Egg")
public class Egg {
        private String color;

        @Override
        public String toString() {
            String eggStr;
            if(this.color == Color.RED){
                eggStr="(D)";
            }else if(this.color == Color.WHITE){
                eggStr="(O)";
            }else{
                eggStr="(G)";
            }
            return eggStr;
        }
}

