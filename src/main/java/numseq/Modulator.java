package numseq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Modulator {

    public List<Long> mod(int m, List<Long> numbers) {
        return numbers.stream().map(number -> number % m).collect(Collectors.toCollection(ArrayList::new));
    }


    // TODO Make this function work for any sequence
    public List<Long> modNRS(int m, List<Long> numbers){
        List<Long> longList = new ArrayList<>();
        for (long number: numbers) {
            longList.add(number);
            if(longList.size() > 2){
                List<Long> firstPart = longList.subList(0, longList.size() / 3 - 1);
                List<Long> secondPart = longList.subList(longList.size() / 3, longList.size() * 2 / 3 - 1);
                List<Long> thirdPart = longList.subList(longList.size() * 2 / 3, longList.size());
                if(firstPart.equals(secondPart) && secondPart.equals(thirdPart)) return firstPart;
            }
        }
        return longList;
    }
}
