public class A8 {
    public static void main(String[] args) {

        String[] word = new String[]{"w","t","y","h","k"};

        for(int i = 0; i < word.length; i++){
            if(word[i] ==  "t") {
                word[i] = "hello";
            }
                System.out.println(word[i]);

        }
    }
}