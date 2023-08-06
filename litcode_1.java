import java.util.Scanner;

public class litcode_1 {
    public static void main(String[] args) {
        //Qn: Given an integer number n, return the difference between the
        // product of its digits and the sum of its digits.
        System.out.println("Enter any number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
         int sum = 0;
         int mul = 1;

         while ( num > 0){
             int rem  = num % 10; //to find last digit .
             mul = mul * rem;
             sum = sum + rem;

             num = num / 10; //to reduce num  by one digit.
         }
        System.out.println(sum);  //to show sum of all digits
        System.out.println(mul);  // to show product of all digit
        System.out.println(mul - sum);

    }
}
