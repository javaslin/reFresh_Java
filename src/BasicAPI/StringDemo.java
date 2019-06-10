package BasicAPI;

public class StringDemo {

    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(a == b);

        /**
         * String.intern()
         *
         * 通过new操作符创建的字符串对象不指向字符串池中的任何对象，
         * 但是可以通过使用字符串的intern()方法来指向其中的某一个。
         * java.lang.String.intern()返回一个保留池字符串，
         * 就是一个在全局字符串池中有了一个入口。
         * 如果以前没有在全局字符串池中，那么它就会被添加到里面
         */
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();

        System.out.println("s1 == s2? " + (s1 == s2)); // false
        System.out.println("s1 == s3? " + (s1 == s3)); // true
    }
}
