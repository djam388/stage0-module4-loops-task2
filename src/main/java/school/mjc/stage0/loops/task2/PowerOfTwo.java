package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(5);
//        printPower(0);
//        printPower(-3);
    }
    public static void printPower(int power) {
        int counter = 0;
        int result = 1;
        if (power != 0 && power > 0) {
            while (counter <= power){
                if (counter != 0) {
                    result = result * 2;
                    System.out.println(result);
                }
                else {
                    System.out.println("1");
                }
                counter++;
            }
        }
        else if (power < 0) {
            System.out.println("too much power");
        }
        else {
            System.out.println("1");
        }
    }
}
