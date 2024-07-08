package dirapp.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {
    // Check Operation merupakan salah satu Terminal Operation (akan triger aliran data Stream)
    // Digunakan untuk melakukan pengecekan data dalam Stream
    // anyMatch(T -> Boolean) --> cek apakah ada salah satu data yang match dengan kondisi
    // allMatch(T -> Boolean) --> cek apakah semua data match dengan kondisi
    // noneMatch(T -> Boolean) --> cek apakah semua data tidak match dengan kondisi

    @Test
    void testAnyMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .anyMatch(item -> item > 20);

        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .allMatch(item -> item > 0);

        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .noneMatch(item -> item > 100);

        System.out.println(match);
    }
}
