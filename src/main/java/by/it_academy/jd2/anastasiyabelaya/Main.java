package by.it_academy.jd2.anastasiyabelaya;

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
        cities.set(1,"Goa");
        String cityWithMaxLength=Util.findCityWithMyLength(cities);
        System.out.println(cityWithMaxLength);
        String cityWithMinLength=Util.findCityWithMinLength(cities);
        System.out.println(cityWithMinLength);
        System.out.println(Util.findCityByFirstLetter(cities,'0'));
    }
}