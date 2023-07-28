package main;

import product.Product;
import productmarket.ProductMarket;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Wine",11));
        products.add(new Product("Snickers",4));
        products.add(new Product("Bred",3.40));
        products.add(new Product("Water",2));

        ProductMarket productMarket = new ProductMarket(products);

        System.out.println("--------------------------");
        System.out.println("All Product Names: " + productMarket.getAllProductNames());
        System.out.println("--------------------------");
        System.out.println("Sorted Names: " + productMarket.getProductNamesPerAlphabet());
        System.out.println("--------------------------");
        System.out.println("Prices greater than 10: " + productMarket.getAllPricesGreaterThan10());
        System.out.println("--------------------------");
        System.out.println("Prices less than 5: " + productMarket.getAllPricesGreaterLessThan5());
        System.out.println("--------------------------");
        System.out.println("Prices as String: " + productMarket.getAllPricesAsString());
        System.out.println("--------------------------");
    }
}
