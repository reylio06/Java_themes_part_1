package main.java;

public class ConcreteFactoryA  implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
