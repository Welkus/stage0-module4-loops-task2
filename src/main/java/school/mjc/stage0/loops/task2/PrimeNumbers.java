package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int sequence = 2;
        if (printToInclusive < 0) {
            System.out.println("can't be prime");
        } else {
            while (sequence < printToInclusive) {
                boolean isPrimitive = true;

                int sequenceChecker = 2;

                int half = sequence / 2;
                while (sequenceChecker <= half) {
                    if (sequence % sequenceChecker == 0) {
                        isPrimitive = false;
                        break;
                    }

                    sequenceChecker++;
                }
                if (isPrimitive) System.out.println(sequence);

                sequence++;
            }

        }
    }
}
