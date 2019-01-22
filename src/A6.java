public class A6 {
    public static void main(String[] args) {

        int[] num = new int[]{2, 5, 9, 0, 2, 1, 8, 5, 4};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            if (num[i] == 5) {
                System.out.println("index : " + i);

            }
        }
    }
}