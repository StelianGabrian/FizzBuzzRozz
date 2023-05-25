public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int number = i + 1, divizibil1 = 3, divizibil2 = 4, divizibil3 = 5;

            if (number % divizibil1 == 0 && number % divizibil2 ==0 && number % divizibil3 ==0) {
                System.out.println("FizzBuzzRozz");
            }
            else if (number % divizibil1 == 0) {
                System.out.println("Fizz");
            }
            else if (number % divizibil2 == 0) {
                System.out.println("Buzz");
            }
            else if (number % divizibil3 == 0) {
                System.out.println("Rozz");
            }
            else {
                System.out.println(number);
            }
        }
    }
}