package productmarket;

import product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    public List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        List<String> names = new ArrayList<>();
        for (Product products : products) {
            names.add(products.getName());
        }
        return names;
    }

    public List<String> getProductNamesPerAlphabet() {
        List<String> names = getAllProductNames();
        Collections.sort(names);
        return names;
    }

    public List<Double> getAllPricesGreaterThan10() {
        List<Double> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 10) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public List<Double> getAllPricesGreaterLessThan5() {
        List<Double> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 5) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public List<String> getAllPricesAsString() {
        List<String> pricesAsString = new ArrayList<>();
        for (Product product : products) {
            pricesAsString.add(String.valueOf(product.getPrice()));
        }
        return pricesAsString;
    }
}