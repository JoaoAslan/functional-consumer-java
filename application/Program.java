package aula4.application;

import aula4.entities.Product;
import aula4.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}