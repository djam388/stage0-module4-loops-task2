package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        printFactorialRow(10);
    }
    public static void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int result = 1;
        if (printToInclusive != 0) {
            while (counter <= printToInclusive){
                if (counter > 1) {
                    result = result * counter;
                    System.out.println(result);
                }
                else {
                    System.out.println("1");
                }
                counter++;
            }
        }
        else {
            System.out.println("1");
        }
    }
}
