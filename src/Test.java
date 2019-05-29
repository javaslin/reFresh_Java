import 设计模式.Singleton;

public class Test {
    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    public static void main(String[] args){
        String str=null;
        str.concat("abc");
        str.concat("123");
        System.out.println(str);
    }
}
