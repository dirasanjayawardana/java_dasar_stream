package dirapp.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilterAndDistinctTest {
    // .filter() dan .distinct() merupakan Filtering Operation (operasi untuk melakukan filter data)
    // .filter(U -> boolean) --> mengambil data yang masuk kriteria ketika returnnya true
    // .distinct() --> menghapus semua data duplikat

    @Test
    void testFilter() {
      List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi").stream()
          .filter(name -> name.length() > 4)
          .forEach(System.out::println);
    
      List.of(1,2,3,4,5,6,7,8,9,10).stream()
          .filter(number -> number % 2 == 0)
          .forEach(System.out::println);
    }


    @Test
    void testDistinct() {
      List.of("Dira", "Sanjaya", "Dira" , "Sanjaya", "Wardana").stream()
          .distinct()
          .forEach(System.out::println);
    }
}
