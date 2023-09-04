public class HW0A {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------");
        for (int j = 0; j < 10; j ++) {
            System.out.println(j);
        }
        System.out.println("-------------------");
        for (int a = 9; a >= 0; a --) {
            System.out.println(a);
        }

        System.out.println("-------------------");

        int ii = 11;
        if (ii % 3 == 0 && ii % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (ii % 3 == 0) {
            System.out.println("Fizz");
        } else if (ii % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(ii);
        }
    }
}
