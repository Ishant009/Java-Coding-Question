package Programs;
public class P1_Sum_Of_Digits {

    public int sumOfDigits(int number){
        int sum=0;
        while(number>0){
            int temp=number%10;
            sum+=temp;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args){
        P1_Sum_Of_Digits p1= new P1_Sum_Of_Digits();
        int sum=p1.sumOfDigits(234);
        System.out.println(sum);
    }
}
