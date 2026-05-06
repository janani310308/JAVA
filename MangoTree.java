import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if(n<=c||n%c==1||n%c==0||n>c*(r-1)){
            System.out.println("Mango Tree");
        }
        else{
            System.out.println("Not a Mango Tree");
        }
    }
}