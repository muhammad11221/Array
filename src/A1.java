import java.sql.SQLOutput;

public class A1 {

    public static void main(String []args){

       int[] rnd = new int [10];
        rnd [0] = 1;
        rnd[1] = 2;
        rnd[2] = 3;
        rnd[3] = 4;
        rnd[4] = 5;
        rnd[5] = 6;
        rnd[6] = 7;
        rnd[7] = 8;
        rnd[8] = 9;
        rnd[9] = 10;

        int arraySize = rnd.length;

        for (int index=0; index<rnd.length; index++){

            System.out.println(rnd[index]);
        }
    }
}
