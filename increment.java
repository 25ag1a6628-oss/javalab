
public class increment {

    // Method to increment a number
    public static int increment(int number) {
        return number + 1;
    }

    public static void main(String[] args) {
        int value = 10;
        int result = increment(value);

        System.out.println("Original value: " + value);
        System.out.println("Incremented value: " + result);
    }
}