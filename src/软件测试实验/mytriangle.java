package 软件测试实验;

public class mytriangle {
    public int istriangle(int a,int b,int c){
        if(!((a+b)>c&&(a+c)>b&&(b+c)>a)) return 0;
        if(((a+b)>c&&(a+c)>b&&(b+c)>a)&&(a!=b&b!=c)) return 1;
        if(((a+b)>c&&(a+c)>b&&(b+c)>a)&&(a==b&&b==c&&a==c)) return 2;
        if(((a+b)>c&&(a+c)>b&&(b+c)>a)&&(a==b || b==c ||c==a)) return 3;
        if(((a+b)>c&&(a+c)>b&&(b+c)>a)&&(a==b || b==c ||c==a)&&(a*a+b*b==c*c||c*c+b*b==a*a||a*a+c*c==b*b)) return 4;
        else {
            return -1;
        }
    }
}
