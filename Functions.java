import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Functions {
    // функция для считывания чисел из файла (название файла известно заранее)
    public static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numberStrings = line.split(" ");
            for (String numberString : numberStrings) {
                int number = Integer.parseInt(numberString);
                numbers.add(number);
            }
        }
        return numbers;
    }
    // функция для поиска минимума в ряду чисел
    public static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    // функция для поиска максимума в ряду чисел
    public static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    // функция для подсчета суммы чисел
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    // функция для подсчета произведения чисел
    public static long getProduct(List<Integer> numbers) {
        long product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
