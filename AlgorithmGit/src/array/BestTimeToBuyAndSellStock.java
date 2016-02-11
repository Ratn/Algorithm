/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 * http://articles.leetcode.com/2010/11/best-time-to-buy-and-sell-stock.html
 * @author ratn
 */
class Stock {
    public int buy;
    public int sell;
    Stock(){this.buy=0;this.sell=0;}
    // When stock can buy and sell once.
    Stock getBestTime(Stock stock, int [] stockPrice) {
        int min = 0;
        int max_diff = 0;

        for( int i=0; i<stockPrice.length; i++) {
            if ( stockPrice[i] < stockPrice[min] ) {
                min = i;
            }
            int diff = stockPrice[i] - stockPrice[min];
            if ( diff > max_diff ) {
                max_diff = diff;
                stock.buy = min;
                stock.sell = i;
            }
        }
        return stock;
    }
    void getMaxProfit(int [] stockPrice) {
        int n = stockPrice.length;
        if ( n <=1) return;
        
        //ArrayList < Stock > stocks = new ArrayList<>();
        Stock[] stocks = new Stock[n/2];
        int count=0;int i=0;
        
        while( i < n-1 ) {
            
            // first go for buying the stock.
            while ( (i < n-1) && (stockPrice[i+1] <= stockPrice[i]) ) {
                i++;
            }
            if ( i == n-1 ) break;
            stocks[count] = new Stock();
            //Stock stock = new Stock();
            //stocks.add(stock);
            
            //stocks.get(count).buy = i++; // time to buy
            stocks[count].buy = i++;
            while ( (i < n) && (stockPrice[i] >= stockPrice[i-1] ) ) {
                i++;
            }
            //stocks.get(count).sell = i-1; // time to sell
            stocks[count].sell = i-1; 
            count++;
            
        }
        for ( i=0; i< count; i++ ) {
            //System.out.println("buy : " + stocks.get(i).buy + ", sell : " + stocks.get(i).sell );
            System.out.println("buy : " + stocks[i].buy + ", sell : " + stocks[i].sell );
        }
        
    }
}
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int stockPrice [] = {100, 180, 260, 310, 40, 535, 695};
        Stock stock = new Stock();
        stock.getBestTime(stock, stockPrice);
        //System.out.println("buy at : " + stock.buy + ", sell at : " + stock.sell);
        stock.getMaxProfit(stockPrice);
    }
}
