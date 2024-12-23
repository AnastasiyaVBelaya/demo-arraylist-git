package by.it_academy.jd2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("Minsk");
        cities.add("Kiev");
        cities.add("New York");
        cities.add("Gomel");
        System.out.println(cities);
        cities.set(2, "Prague");
        int maxLength = cities.get(0).length();
        String cityMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityMaxLength = city;
                maxLength=city.length();
            }
        }
        System.out.println(cityMaxLength);
    }
}