package dirapp.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ParalelStreamTest {
    // Di java, Stream bisa dijalankan secara paralel (dijalankan secara bersamaan)
    // Secara default, Paralel Stream akan jalan di ForkJoinPool(running beberapa proses sekaligus), dimana akan dirunning secara default menggunakan thread sejumlah maksimal total CPU

    @Test
    void testSequential() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }

    @Test
    void testParallel() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }
}
