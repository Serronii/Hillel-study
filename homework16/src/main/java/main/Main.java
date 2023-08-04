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

        System.out.println("-------------------------------------------");
        System.out.println("Все имена продуктов : ");

        products.stream()
                .forEach(product -> System.out.println(product.getName()));

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все имена по алфавиту");

        products.stream()
                .map(product -> product.getName())
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все цены больше 10 :");

        products.stream()
                .filter(product -> product.getPrice() > 10)
                .map(product -> product.getPrice())
                .forEach(product -> System.out.println(product));
        // ИЛИ
        products.stream()
                .filter(product -> product.getPrice() > 10)
                .forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть все цены меньше 10 :");

        products.stream()
                .filter(product -> product.getPrice() < 10)
                .forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));

        System.out.println("-------------------------------------------");
        System.out.println("Вернуть цены как стринг :");

        List<String> price = products.stream()
                .map(product -> String.valueOf(product.getPrice()))
                .collect(Collectors.toList());

        System.out.println(price);
    }

}
