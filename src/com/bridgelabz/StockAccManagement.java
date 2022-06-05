package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccManagement {

    static class Stock {
        private String stockNames;
        private int numberOfShare;
        private int sharePrice;

        public String getStockNames() {
            return stockNames;
        }

        public void setStockNames(String stockNames) {
            this.stockNames = stockNames;
        }

        public int getNumberOfShare() {
            return numberOfShare;
        }

        public void setNumberOfShare(int numberOfShare) {
            this.numberOfShare = numberOfShare;
        }

        public int getSharePrice() {
            return sharePrice;
        }

        public void setSharePrice(int sharePrice) {
            this.sharePrice = sharePrice;
        }
    }

   static class StockData {
        static ArrayList<Stock> data = new ArrayList<>();
        static int totalValue;

        public static void addStock() {
            Scanner scan = new Scanner(System.in);
            Stock stockInfo = new Stock();

            System.out.println("Enter a Name of Stock: ");
            stockInfo.setStockNames(scan.next());
            System.out.println("Enter Number of Shares you want to purchase: ");
            stockInfo.setNumberOfShare(scan.nextInt());
            System.out.println("Enter Share Price: ");
            stockInfo.setSharePrice(scan.nextInt());

            data.add(stockInfo);
            System.out.println("Stock Added Successful");
        }

        public static void addNoOfStock() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Number of Stock you want to add");
            int noOfStock = scan.nextInt();
            for (int i = 0; i < noOfStock; i++) {
                addStock();
            }
        }

        public static void totalValue() {
            for (Stock stock : data) {
                totalValue += stock.sharePrice * stock.numberOfShare;
            }
            System.out.println(totalValue);
        }
    }

    public static void main(String[] args) {

        StockData stocks = new StockData();

        int choice = 0;
        while (choice < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter your choice 1: Add Stock 2: Add Multiple of Stocks 3: Display Total value of Stocks 0: Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stocks.addStock();
                    break;
                case 2:
                    stocks.addNoOfStock();
                    break;
                case 3:
                    System.out.println("Total value of your stocks is : ");
                    stocks.totalValue();
                    break;
                default:
                    choice = 4;
                    break;
            }
        }
    }
}
