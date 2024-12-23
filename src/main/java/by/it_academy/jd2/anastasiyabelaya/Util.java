package by.it_academy.jd2.anastasiyabelaya;

import java.util.ArrayList;

public class Util {
    public static String findCityWithMyLength(ArrayList<String> cities) {
        int maxLength = cities.get(0).length();
        String cityMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityMaxLength = city;
                maxLength = city.length();
            }
        }
        return cityMaxLength;
    }
}
