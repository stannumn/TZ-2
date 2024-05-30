import java.io.IOException;
import java.util.List;

public class FuncTime {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Functions.readNumbersFromFile("numbers.txt");

        // замеряем время для функции getMin
        long startTime = System.nanoTime();
        int min = Functions.getMin(numbers);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения функции getMin: " + executionTime + " ns");

        // замеряем время для функции getMax
        startTime = System.nanoTime();
        int max = Functions.getMax(numbers);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения функции getMax: " + executionTime + " ns");

        // замеряем время для функции getSum
        startTime = System.nanoTime();
        int sum = Functions.getSum(numbers);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения функции getSum: " + executionTime + " ns");

        // замеряем время для функции getProduct
        startTime = System.nanoTime();
        long product = Functions.getProduct(numbers);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения функции getProduct: " + executionTime + " ns");
    }
}
