import java.util.Scanner;
import java.lang.Math;
public class divide_or_square {
    public static void divide_or_squares(int n){
        int num=n;
        double k= Math.pow(num,0.5);
        System.out.println(k);
    }
    public static void main(String[] args){
        Scanner objec=new Scanner(System.in);
        System.out.println("Enter a  number : ");
        int numb=objec.nextInt();
        divide_or_squares(numb);

    }
}
