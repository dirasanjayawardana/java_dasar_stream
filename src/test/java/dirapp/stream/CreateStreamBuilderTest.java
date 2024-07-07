package dirapp.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {
    // Bisa membuat Stream dengan Stream Builder
    // Stream yg dibuat mirip seperti Collection
    // bisa menambahkan data ke Stream Builder, setelah selesai baru membuat Streamnya

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        // method accept() untuk menambahkan data dan returnnya void
        builder.accept("Dira");
        // method add() untuk menambahkan data dan returnnya adalah data itu sendiri, sehingga bisa di chaining
        builder.add("Sanjaya").add("Wardana");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Dira").add("Sanjaya").add("Wardana").build();

        stream.forEach(System.out::println);
    }
}
