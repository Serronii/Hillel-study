package main;

import product.Product;
import productmarket.ProductMarket;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Wine", 11));
        products.add(new Product("Snickers", 4));
        products.add(new Product("Bred", 3.40));
        products.add(new Product("Water", 2));

        ProductMarket market = new ProductMarket(products);

        System.out.println("-------------------------------------------");
        System.out.println("Все имена продуктов : " + market.getAllProductNames());

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все имена по алфавиту : " + market.getProductNamesSortedByAlphabetic());

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все цены больше 10 :" + market.getPricesBiggerThan10());

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все цены меньше 10 :" + market.getPricesLessThan0());

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть цены как стринг : " + market.getPricesAsString());

    }
}
