package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        printFactorialRow(8);
    }
    public static void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int result = 1;
        if (printToInclusive != 0) {
            while (counter <= printToInclusive){
                result = result * counter;
                System.out.println(result);
                counter++;
            }
        }
        else {
            System.out.println("1");
        }
    }
}
