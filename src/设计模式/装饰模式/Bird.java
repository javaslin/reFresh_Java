package 设计模式.装饰模式;

public class Bird extends Change {

    public Bird(TheGreastSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }
}
