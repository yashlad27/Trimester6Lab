public class PrintOddEvenNumber {
    int counter = 1;
    static int N;

    public void printOdd() {
        while (counter < N) {
            while (counter % 2 == 0) {
                System.out.println(counter + " "+ " Odd");
                counter++;
            }
        }
    }

    public void printEven() {
        while (counter < N) {
            while (counter % 2 == 1) {
                System.out.println(counter + " "+" Even");
                counter++;
            }
        }
    }
}
