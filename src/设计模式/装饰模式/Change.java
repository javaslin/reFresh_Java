package 设计模式.装饰模式;

public class Change implements TheGreastSage {
    private TheGreastSage sage;

    public Change(TheGreastSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
