import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

public class FuncTest {
    private static List<Integer> numbers;
    // перед каждым тестом получаем числа из файла
    @BeforeAll
    public static void setUp() throws IOException {
        numbers = Functions.readNumbersFromFile("numbers.txt");
    }

    @Test
    public void testGetMin() {
        int min = Functions.getMin(numbers);
        Assertions.assertEquals(1, min);
    }

    @Test
    public void testGetMax() {
        int max = Functions.getMax(numbers);
        Assertions.assertEquals(10, max);
    }

    @Test
    public void testGetSum() {
        int sum = Functions.getSum(numbers);
        Assertions.assertEquals(55, sum);
    }

    @Test
    public void testGetProduct() {
        long product = Functions.getProduct(numbers);
        Assertions.assertEquals(3628800, product);
    }
    // проверка на то, что функция поиска произведения чисел работает не более 100 наносекунд
    @Test
    public void testTimeout() {
        Assertions.assertTimeoutPreemptively(java.time.Duration.ofNanos(100), () -> {
            Functions.getProduct(numbers);
        });
    }
}
