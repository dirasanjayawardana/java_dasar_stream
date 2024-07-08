package dirapp.stream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;

public class PrimitiveStreamTest {
    // umumnya Stream<T> hanya menerima tipe data object
    // untuk membuat Stream dari tipe data primitive bisa gunakan:
    // java.util.stream.IntStream --> untuk membuat Stream dari tipe data int
    // java.util.stream.LongStream --> untuk membuat Stream dari tipe data long
    // java.util.stream.DoubleStream --> untuk membuat Stream dari tipe data double

    @Test
    void testCreate() {
      IntStream intStream = IntStream.range(1, 100);
      intStream.forEach(System.out::println);

      LongStream longStream = LongStream.of(1, 2, 3, 4);

      DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
    }

    @Test
    void testOperations() {
      IntStream intStream = IntStream.range(1, 100);

      // method .average() untuk menghitung rata-rata, tidak ada di Stream<T>
      OptionalDouble optionalDouble = intStream.average();
      optionalDouble.ifPresent(System.out::println);

      // .mapToObject() merubah tipe data primtive menjadi object String
      IntStream.range(0, 100)
          .mapToObj(number -> "Number : " + number)
          .forEach(System.out::println);
    }
}
