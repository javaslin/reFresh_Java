package 设计模式.适配器模式;

public class Client {

    public static void main(String[] args){
        Turkey turkey=new WildTurkey();
        Duck duck=new TurkeyAdapter(turkey);
        duck.quack();
    }
}
