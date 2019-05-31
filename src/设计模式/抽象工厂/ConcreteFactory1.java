package 设计模式.抽象工厂;

public class ConcreteFactory1 extends AbstractFactory {

    AbstractProductA createProductA() {
        return new ProductA1();
    }


    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
