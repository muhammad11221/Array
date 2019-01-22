import java.util.Scanner;

public class A4 {
    public static void main(String [] args){

        int userinput = 0;
        Scanner keyboard = new Scanner(System.in);


        int[] rnd = new int[10];
        for (int i = 0; i < rnd.length; i++) {
            System.out.println("Enter input;");
            rnd[i] = keyboard.nextInt();

        }


        int sum = 0;
        double avg = 0;
        for (int index=0; index<rnd.length; index++){



            sum = sum + rnd[index];
            avg = sum/10.0;



            System.out.println("Average:" + avg);
        }
    }
}