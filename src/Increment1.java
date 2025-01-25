public class Increment1 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // ++a = 11
        // a++ = 11  a=12
        // a++ = 12  a=13

    }
}
