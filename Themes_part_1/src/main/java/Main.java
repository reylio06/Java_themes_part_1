package main.java;
public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory pattern
        ProductFactory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.displayInfo();

        ProductFactory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.displayInfo();

        // Adapter pattern
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}