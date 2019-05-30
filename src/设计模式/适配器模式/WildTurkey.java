package 设计模式.适配器模式;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
