import java.util.Scanner;
public class MiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three digit value:");
        int n = sc.nextInt();
        int mid = (n/10)%10;
        if(n<100||n>999){
            System.out.println("Not A Three Digit Number");
        }
        else if(mid%3==0){
            System.out.println("Middle Digit:"+mid);
            System.out.println("Middle Number is Divisible by 3");
        }
        else{
            System.out.println("Middle Digit:"+mid);
            System.out.println("Middle Number is not Divisible by 3");
        }
    }
}
