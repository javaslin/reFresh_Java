package 设计模式.简单工厂模式;

import 设计模式.简单工厂模式.ConcreteProduct;
import 设计模式.简单工厂模式.ConcreteProduct1;
import 设计模式.简单工厂模式.ConcreteProduct2;
import 设计模式.简单工厂模式.Product;

public class SimpleFactory {
    public Product createProduct(int type){
        if(type==1){
            return new ConcreteProduct1();
        }else if (type==2){
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
