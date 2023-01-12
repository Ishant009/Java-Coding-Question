import java.util.Scanner;

public class P3_NumberOfDigitsMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        P3_NumberOfDigits numberOfDigits= new P3_NumberOfDigits();
        int num= numberOfDigits.noOfDigits(number);
        System.out.println(num);
    }
}
