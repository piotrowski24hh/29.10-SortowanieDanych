package org.example.SortowanieDanych;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StockMain {
    @Override
    public boolean equals(Object obj) {

        return false;
    }

    public static void main(String[] arg) {
        Stock stock1 = new Stock("amazon", "amz", 5.23);
        Stock stock2 = new Stock("microsotf", "msf", 157.23);
        Stock stock3 = new Stock("google", "ggl", 7.23);
        Stock stock4 = new Stock("apple", "apl", 67.23);

        List<Stock> stocks = new ArrayList<>();
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        stocks.add(stock4);


        Collections.sort(stocks,new StockComparator());
        for (Stock s : stocks)
            System.out.println(s.toString());
    }
}