public class FizzBuzz {
    public String convert(int number) {
        // Hint: Check for divisibility by both 3 and 5 first!
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.printSequence(15);  // Example: prints 1 to 15 sequence
    }

    public void printSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(convert(i));
        }
    }
}


//Phildah