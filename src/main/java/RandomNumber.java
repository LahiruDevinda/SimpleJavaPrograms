import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();


        boolean isHead;
        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("HEAD");
        }else{
            System.out.println("TAILS");
        }
    }
}
