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

    public static String findCityWithMinLength(ArrayList<String> cities) {
        int minLength = cities.get(0).length();
        String cityMinLength = cities.get(0);
        for (String city : cities) {
            if (city.length() < minLength) {
                cityMinLength = city;
                minLength = city.length();
            }
        }
        return cityMinLength;
    }

    public static String findCityByFirstLetter(ArrayList<String> cities, char firstLetter) {
        String tempChar = "" + firstLetter;
        for (String city : cities) {
            if (city.toLowerCase().charAt(0) == tempChar.toLowerCase().charAt(0)) {
                return city;
            }
        }
        return "";
    }
}
