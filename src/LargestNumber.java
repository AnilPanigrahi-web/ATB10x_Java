public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 210;
        int c = 30;

        int largest = (a > b) ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println(largest);


    }
}
