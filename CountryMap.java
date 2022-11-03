package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,Long> countries= new HashMap<>();
        countries.put("China",10000L);
        countries.put("USA",12356L);
        countries.put("Poland",323434L);

        //odbior kluczykow
        for(String key: countries.keySet()) {
            System.out.println(key);
        }


        //odbior wartosci
        for(long val:countries.values()) {
            System.out.println(val);
        }
        System.out.println("");
        //odbior wartosci z uzywaniem kluczyka
        for(String key: countries.keySet()) {
            System.out.println(key+ "->" +countries.get(key));
        }
        //suma mieszkańców
        Long v =0L;
        for(long val : countries.values()){
            v=v+val;
            //long result = countries();


        }
        System.out.println(v);
    }

}
