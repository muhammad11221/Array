import java.util.Scanner;
public class ArraysToRemember {
    public static void main (String []args) {

//        String userinput;
        Scanner word = new Scanner(System.in);
        String[] tip = new String[5];


        for (int i = 0; i < tip.length; i++) {

            System.out.println("Enter Words : ");
            String userinput = word.next();


            if (!userinput.equalsIgnoreCase("History")) {
                tip[i] = userinput;
            }else {
                break;
            }

        }

        for (int j = 0; j <tip.length ; j++) {
            System.out.println(tip[j]);
        }

    }


}
