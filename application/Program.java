package aula4.application;

import aula4.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        Double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}