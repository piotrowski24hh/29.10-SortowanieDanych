package org.example.SortowanieDanych;

public class Stock implements Comparable {
    String name;
    String symbol;
    Double price;

    public Stock(String name, String symbol, Double price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int c = 0;

        if (this.price > ((Stock) o).price){
            c = 1;
        }else if (this.price < ((Stock) o).price){
            c = -1;
        }else if (this.price.equals(((Stock) o).price)){
            c=0;
        }
//ify przepisac i zwrócić  sortowanie po wielu polach
        return c;


    }
}


