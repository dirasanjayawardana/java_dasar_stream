package dirapp.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class MapAndFlatMapTest {
    // .map() dan .flatMap() termasuk dalam Transformation operation (operasi untuk mengubah bentuk Stream menjadi Stream Baru)
    // .map() dan .flatMap() juga termasuk dalam Intermediate operation karena returnnya Stream dan tidak triger aliran Stream
    // .map() digunakan untuk memetakan setiap elemen dari stream ke elemen baru menggunakan fungsi yang diberikan
    // .flatMap() digunakan ketika perlu memetakan setiap elemen dari stream ke stream baru, dan kemudian meratakan hasilnya menjadi satu stream tunggal

    @Test
    void testMap() {
      List.of("Dira", "Sanjay", "Wardana").stream()
          .map(name -> name.toUpperCase())
          .map(upper -> upper.length())
          .forEach(length -> System.out.println(length));
    }

    
    @Test
    void testFlatMap() {
      List.of("Dira", "Sanjay", "Wardana").stream()
        .map(name -> name.toUpperCase())
        .flatMap(upper -> Stream.of(upper, upper.length()))
        .flatMap(value -> Stream.of(value, value, value))
        .forEach(length -> System.out.println(length));
    }
}
