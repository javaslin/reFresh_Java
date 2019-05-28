package 数组和矩阵;
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {

    public void reOrderArray(int[] array){
        int cnt=0;
        for (int a:array) {
            if(a%2!=0) cnt++;
        }
        int[] copy=array.clone();
        int i=0,j=cnt;

        for (int b:copy) {
            if(b%2==0){
                array[j++]=b;
            }else {
                array[i++]=b;
            }
        }
    }
}
