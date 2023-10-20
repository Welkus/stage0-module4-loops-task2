package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        if(printTillInclusive == 0){

            System.out.println("0");
        }
        else {
            while (i <= printTillInclusive){
                if(i%2==0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
