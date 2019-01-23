import java.util.Scanner;

public class AnArrayToRemember {

    public static void main (String []args){

        Scanner name = new Scanner(System.in);
        String[] tip = new String[]{"Knnedey", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};

        for (int i = 0; i < tip.length; i++) {

            System.out.println("Enter president's names : ");
            String userinput = name.next();


            if (!userinput.equalsIgnoreCase("History")) {
                tip[i] = userinput;
            }else {
                break;
            }

        }

        for (int j = tip.length-1 ; j >= 0; j--) {
            System.out.println(tip[j]);
        }

    }


}
