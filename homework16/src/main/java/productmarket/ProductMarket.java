package productmarket;

import product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    public List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getProductNamesSortedByAlphabetic() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getPricesBiggerThan10() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPricesLessThan0() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 10)
                .collect(Collectors.toList());
    }

    public List<String> getPricesAsString() {
        return products.stream()
                .map(product -> String.valueOf(product.getPrice()))
                .collect(Collectors.toList());
    }
}
