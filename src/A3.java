import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        int userinput = 0;
        Scanner keyboard = new Scanner(System.in);


        int[] rnd = new int[10];
        for (int i = 0; i < rnd.length; i++) {
            System.out.println("Enter input;");
            rnd[i] = keyboard.nextInt();

        }


       int sum = 0;
     for (int index=0; index<rnd.length; index++){

         System.out.println(sum + " = " + sum + " + " + "rnd[" + index + "]");
         System.out.println("rnd[" + index + "] = " + rnd[index]);

         sum = sum + rnd[index];



         System.out.println("Total :" +sum );
    }
}
    }