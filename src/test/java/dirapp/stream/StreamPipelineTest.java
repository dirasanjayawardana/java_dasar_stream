package dirapp.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamPipelineTest {
    // Stream Pipeline berisi kumpulan operasi pada Stream
    // Stream Pipeline terdiri dari sebuath sumber Stream (bira Array, Collection, dll), lalu diikuti dengan kosong atau lebih Stream Operation dan diakhiri dengan operasi akhir, misalnya forEach() atau collect()


    // Tanpa menggunakan Stream Pipeline, cara ini jarang sekali digunakan
    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("Dira", "Sanjaya", "Wardana");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }


    // Menggunakan Stream Pipeline
    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("Dira", "Sanjaya", "Wardana");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
