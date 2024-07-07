package dirapp.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class IntermediateAndTerminalOperationTest {
    // Intermediate Operation merupakan lazy operation, dimana Stream tidak akan dieksekusi sampai memang dibutuhkan atau di trigger oleh Terminal Operation.
    // Terminal Operation merupakan operasi yg  men-Triger sebuah Stream mengalir atau dijalankan.

    // Cara mengetahui apakah Operation sebuah Intermediate Operation atau Terminal Operation:
    // Jika returnnya adalah Stream maka itu termasuk Intermediate Operation. contoh .map()
    // Jika returnnya selai Stream, misalnya void, maka itu termasuk Terminal Operation. contoh .foreEach(), collect()

    @Test
    void testIntermediateOperation() {

      List<String> names = List.of("Dira", "Sanjaya", "Wardana");

      // Stream tidak dijalankan karena .map() merupakan Intermediate operation
      Stream<String> upper = names.stream()
          .map(name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
          });
    }


    @Test
    void testTerminalOperation() {

      List<String> names = List.of("Dira", "Sanjaya", "Wardana");

      // Stream akan dijalankan karena .forEach() adalah terminal operation
      names.stream()
          .map(name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
          })
          .map(upper -> {
            System.out.println("Change " + upper + " to Mr.");
            return "Mr." + upper;
          })
          .forEach(mr -> {
            System.out.println(mr);
          });
    }
}
