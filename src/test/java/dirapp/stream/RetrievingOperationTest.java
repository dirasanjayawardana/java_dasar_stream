package dirapp.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {
    // Retrieving Operation adalah operasi untuk melakukan pengambilan sebagian data


    // limit(n) --> mengambi sejumlah n data
    @Test
    void testLimit() {
        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    // skip(n) --> menghiraukan sejumlah n data
    @Test
    void testSkip() {
        List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    // takeWhile(T -> Boolean) --> mengambil data selama returnnya true 
    // bedanya dengan filter, filter mengambil data ketika returnnya true
    @Test
    void testTakeWhile() {
        List.of("Dira", "Doni", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    // dropWhile(T -> Boolean) --> menghiraukan data selama returnnya true
    @Test
    void testDropWhile() {
        List.of("Dira", "Doni", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    // findAny() --> mengambil satu data random, termasuk terminal operation (langsung menjalankan aliran datanya)
    // returnnya adalah Optional
    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    // findFirst() --> mengambil satu data pertama, termasuk terminal operation (langsung menjalankan aliran datanya)
    // returnnya adalah Optional
    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
