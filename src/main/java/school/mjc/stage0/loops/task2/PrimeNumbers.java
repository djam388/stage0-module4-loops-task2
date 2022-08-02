package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(150);
    }
    public static void printPrimeNumbers(int printToInclusive) {
        boolean isNotPrimeNumber = false;
        int counterOne = 2;
        int counterTwo;
        while (counterOne <= printToInclusive) {
            counterTwo = 2;
            while (counterTwo < counterOne) {
                if (counterOne % counterTwo == 0) {
                    isNotPrimeNumber = true;
                }
//                System.out.println(counterOne + " % " + counterTwo + " => " + counterOne % counterTwo);
                counterTwo++;
            }
//            System.out.println("");
            if (isNotPrimeNumber != true) {
                System.out.println(counterOne);
            }
            isNotPrimeNumber = false;
            counterOne++;
        }
    }
}
