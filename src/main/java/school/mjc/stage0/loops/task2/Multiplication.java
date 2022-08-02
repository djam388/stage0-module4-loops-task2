package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        printMultiplied(10);
        printMultiplied(-8);
        printMultiplied(0);
    }
    public static void printMultiplied(int multiplyByAndToInclusive) {
        boolean isNegative = false;
        int counter = 0;
        if (multiplyByAndToInclusive < 0) {
            isNegative = true;
            multiplyByAndToInclusive = multiplyByAndToInclusive * -1;
        }
        if (multiplyByAndToInclusive != 0) {
            while (counter <= multiplyByAndToInclusive) {
                if (isNegative == false) {
                    System.out.println(counter * multiplyByAndToInclusive);
                }
                else {
                    System.out.println(counter * multiplyByAndToInclusive * -1);
                }
                counter++;
            }
        }
//        else {
//            System.out.println("");
//        }

    }
}
