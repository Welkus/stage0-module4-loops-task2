package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int t = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : -multiplyByAndToInclusive;

            int i = 0;
            while (i <= t) {
                int result = i * multiplyByAndToInclusive;
                System.out.println(result);
                i++;

            }
        }
    }
}
