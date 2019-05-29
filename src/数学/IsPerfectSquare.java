package 数学;

public class IsPerfectSquare {

    public boolean isPerfectSquare(int n){
        int subNum=1;
        while (n>0){
            n-=subNum;
            subNum+=2;
        }
        return n==0;
    }
}
