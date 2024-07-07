package dirapp.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {
    // Ordering operation adalah operasi untuk melakukan pengurutan data
    // sorted() --> secara default data diurutkan berdasarkan Comparable yang terdapat di data yg berada di Stream
    // sorted(Comparator) --> Jika ingin mengurutkan secara default, kita bisa menggunakan Comparator sendiri

    @Test
    void testSorted() {
        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        Comparator<String> reverseComparator2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko").stream()
                .sorted(reverseComparator2)
                .forEach(System.out::println);
    }
}
