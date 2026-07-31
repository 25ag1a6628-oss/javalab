
public class sample {

    // Method to increment a number
    public static int sample(int num) {
        return ++num;
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Original Number: " + number);

        number = sample(number);

        System.out.println("After Increment: " + number);
    }
}