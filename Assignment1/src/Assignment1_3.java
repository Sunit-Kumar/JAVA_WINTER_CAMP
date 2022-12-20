import java.util.Scanner;

public class Assignment1_3 {
    public static void condition(int l[],int a,int b){
        int sum = 0;
        boolean add = true;

        for (int i=0; i<l.length; i++) {

            if (l[i] != a && add == true)

                sum = sum + l[i];

            else if (l[i] == a)
                add = false;

            else if (l[i] == b)
                add = true;

        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        //System.out.println("Enter the array: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }
        condition(myArray,6,7);

    }
}
