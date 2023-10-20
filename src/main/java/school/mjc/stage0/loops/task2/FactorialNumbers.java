package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int sum = 1;
        if (printToInclusive == 0) {
            System.out.println("1");
        } else if (printToInclusive < 0) {
            System.out.println("no negatives");
        } else {
            System.out.println("1");
            while (i <= printToInclusive) {
                sum *= i;
                i++;
                System.out.println(sum);

            }


        }
    }
}
