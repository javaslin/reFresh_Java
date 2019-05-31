package BasicAPI;

class Person implements Cloneable {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("张三");
        Person p2 = (Person) p1.clone();
        p2.setName("李四");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }

}
