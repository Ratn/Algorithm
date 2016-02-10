/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 * http://articles.leetcode.com/2010/11/best-time-to-buy-and-sell-stock.html
 * @author ratn
 */
class Stock {
    public int buy;
    public int sell;
    Stock(){this.buy=0;this.sell=0;}
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
}
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int stockPrice [] = {100, 180, 260, 310, 40, 535, 695};
        Stock stock = new Stock();
        stock.getBestTime(stock, stockPrice);
        System.out.println("buy at : " + stock.buy + ", sell at : " + stock.sell);
    }
}
