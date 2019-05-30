package 设计模式.装饰模式;

public class Fish extends Change {
    public Fish(TheGreastSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }
}
