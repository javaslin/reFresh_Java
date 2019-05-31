package 设计模式.装饰模式;

public class Client {

    public static void main(String[] args) {

        TheGreastSage sage = new Monkey();
        TheGreastSage bird = new Bird(sage);
        TheGreastSage fish = new Fish(bird);

        fish.move();

    }
}
