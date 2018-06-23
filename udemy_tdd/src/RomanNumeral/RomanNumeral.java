package RomanNumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    Map<String, Integer> map = new HashMap<>();

    public RomanNumeral() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

    }

    public int convert(String roman) {
        int result = 0;
        if (roman.length() == 1) {
            return map.get(roman);
        } else if (roman.length() == 2){
            String lftChar = String.valueOf(roman.charAt(0));
            String rgtChar = String.valueOf(roman.charAt(1));
            int lftVal = map.get(lftChar);
            int rgtVal = map.get(rgtChar);
            if (lftVal < rgtVal) {
                result = rgtVal - lftVal;
            } else {
                result = rgtVal + lftVal;
            }
        }
        return result;
    }
}
