package aula4.util;

import aula4.entities.Product;

import java.util.function.Consumer;

//https://docs.oracle.com/javase/10/docs/api/java/util/function/Consumer.html
public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
