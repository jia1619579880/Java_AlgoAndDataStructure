package Com.itheima.Test;

import java.util.Scanner;

public class Leijia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(Leijia(a));
    }
    public static int Leijia(int a){
        int i,sum=0;
        for(i=0;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}
