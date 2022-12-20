import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        int revn = 0;
        while(n!=0){
            revn=revn*10+n%10;
            n=n/10;
        }
        System.out.println("The reverse num is :"+ revn);
    }
}
