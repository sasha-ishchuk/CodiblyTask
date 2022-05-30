import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BubbleSort {
    public List<Comparable<? extends Number>> sort(List<Comparable<? extends Number>> input){
        if(input == null){
            throw new NullPointerException("input is NULL");
        }

        if(input.isEmpty()){
            return new ArrayList<>();
        }

        input.removeIf(Objects::isNull);

        for(int i = 0; i < input.size(); i++){
            for(int j = 0; j < input.size() - 1; j++){
                BigDecimal d1 = new BigDecimal(input.get(j).toString());
                BigDecimal d2 = new BigDecimal(input.get(j+1).toString());
                if(d1.compareTo(d2) > 0){
                    Collections.swap(input, j, j + 1);
                }
            }
        }

        return input;
    }
}
