package org.example.SortowanieDanych;

import java.util.Comparator;

public class StockComparator implements Comparator<Stock> {
    @Override
    public int compare(Stock o1,Stock o2) {
        int c=0;
        if(o1.price > o2.price) {
            c = 1;
        } else if (o1.price <o2.price) {
            c = -1;
        } else if (o1.price.equals(o2.price)) {
            c=0;
        }

        return c;
    }
 //compareResult=this.getName()compareToIgnoreCase(o.getName())
    @Override
    public Comparator<Stock> thenComparing(Comparator<? super Stock> other) {
        return Comparator.super.thenComparing(other);
    }
}

//szukac przez name i price
