package com.free;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Mercury");
        planets.add("Uranus");
        planets.add("Pluto");

        ArrayList<String> moons = new ArrayList<>();
        moons.add("Europa");
        moons.add("Callisto");
        moons.add("Ganymede");
        moons.add("Titan");
        moons.add("Moon");
        moons.add("Titania");
        moons.add("Oberon");

        System.out.println(planets);

        moons.add(String.valueOf(planets));

        System.out.println(moons);

        planets.remove(1);

        System.out.println(planets);

        String planet = planets.get(3);

        System.out.println(planet);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);

        Reverse revArray = new Reverse();
        revArray.reverseArrayList(moons);
        revArray.reverseArrayList(planets);

        System.out.println(moons);
        System.out.println(planets);


    }

}
