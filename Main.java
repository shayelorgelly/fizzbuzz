package net.shayelorgelly;
//arrow casing requires at least java 12
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(switch (i % 15) {
                case 0 -> "FizzBuzz";
                case 3,6,9,12 -> "Fizz";
                case 5,10 -> "Buzz";
                default -> i;
            });
        }
    }
}
