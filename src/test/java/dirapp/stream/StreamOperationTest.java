package dirapp.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperationTest {
    // Stream Operation Merupakan kumpulan operasi-operasi yang bisa digunakan untuk memanipulasi Stream itu sendiri.
    // Stream Operation tidak akan memodifikasi data aslinya, melainkan hasil dari Stream Operation adalah Stream baru

    @Test
    void testStreamOperation() {
        List<String> names = List.of("Dira", "Sanjaya", "Wardana");

        Stream<String> streamNames = names.stream();
        // map digunakan untuk menghasilkan data baru dari Stream
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(name -> System.out.println(name));
        // data hasil dari Stream tidak akan merubah data aslinya
        names.forEach(name -> System.out.println(name));
    }
}
