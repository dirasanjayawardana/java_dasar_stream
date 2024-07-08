package dirapp.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AgregateOperationTest {
    // Aggregate Operation merupakan salah satu terminal operator (akan mentriger jalannya aliran data pada Stream, tidak menghasilkan stream baru)
    
    
    // max(Comparator) --> mencari data max seusai comparator
    @Test
    void testMax() {
        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko").stream()
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
    }
    
    
    // min(Comparator) --> mencari data min seusai comparator
    @Test
    void testMin() {
        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko").stream()
        .min(Comparator.naturalOrder())
        .ifPresent(System.out::println);
    }
    

    // count() --> menghitung total data
    @Test
    void testCount() {
        long count = List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko").stream()
                .count();
        System.out.println(count);
    }

    // reduce(nilaiAwal, (value, valuSelanjutnya) -> return)
    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);

        // 0
        // 1. value=0 item=1 = 1
        // 2. value=1 item=2 = 3
        // 3. value=3 item=3 = 6
        // 4. value=6 item=4 = 10
        // 5. value=10 item=5 = 15
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);

        // 1
        // 1. value=1 item=1 = 1
        // 2. value=1 item=2 = 2
        // 3. value=2 item=3 = 6
        // 4. value=6 item=4 = 24
        // 5. value=24 item=5 = 120
    }
}
