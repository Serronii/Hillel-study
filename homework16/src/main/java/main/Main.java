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
        System.out.println("Comparator Sort Products By Price: ");
        System.out.println(productMarket.sortByPrice());
        System.out.println("-----------------------------");
        System.out.println("Comparator Sort Products By Name: ");
        System.out.println(productMarket.sortByName());

    }
}
