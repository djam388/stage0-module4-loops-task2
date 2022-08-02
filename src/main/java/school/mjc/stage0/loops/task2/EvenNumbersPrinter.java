package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        printEvenNumbers(10);
    }
    public static void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        while (counter <= printTillInclusive) {
            if (counter % 2 == 0 && counter != 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
