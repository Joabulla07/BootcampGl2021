package com.joanna.farm.models;
import com.joanna.farm.constants.Color;
import org.springframework.stereotype.Component;



import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;




@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Component("Egg")
public class Egg {
        private String color;
        
        public String getColor() {
        	return this.color;
        }
        
        

        public void setColor(String color) {
			this.color = color;
		}



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

