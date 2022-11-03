package org.example.HashMap;

import java.util.*;

public class CountryMap2 {

    public static void main(String[] args) {
        Map<String, Long> countries = new TreeMap<>();
        countries.put("China", 10000L);
        countries.put("USA", 12356L);
        countries.put("Poland", 323434L);

        //odbior kluczykow
        for (String key : countries.keySet()) {
            System.out.println(key);
        }


        //odbior wartosci
        for (long val : countries.values()) {
            System.out.println(val);
        }
        System.out.println("");
        //odbior wartosci z uzywaniem kluczyka
        for (String key : countries.keySet()) {
            System.out.println(key + "->" + countries.get(key));
        }
        //suma mieszkańców
        long v = 0L;
        for (long val : countries.values()) {
            v = v + val;
            //long result = countries();
// zadanie2
            CountryMap2 countryMap2 = new CountryMap2();
            countryMap2.zadanie2(countries);
        }
    }

    public void zadanie2(Map<String, Long> countries) {
        Long v = 0L;
        for (String key : countries.keySet()) {
            if (key.equals("USA")) {

                Long val = countries.get(key);
                v = v + val;
            }
            System.out.println(v);
        }
        // zadanie3
        CountryMap2 countryMap2 = new CountryMap2();
        countryMap2.zadanie2(countries);
    }

    public void zadanie3(Map<String, Long> countries) {

        for (String key : countries.keySet()) {
            long v = 0;
            if (key.equals("USA") || key.equals("Poland")) {

             //   Long val = countries.compute(key);
            //    v = v + val;

            }
            System.out.println(v);
        }

/*
        public void KeyToList(Map<String, Long>countries) {
        List<String> result = new ArrayList<();
        result.addAll(countries.keySet());
        for(String c: result)
            System.out.println(c);


        }
    }

 */
    }
}