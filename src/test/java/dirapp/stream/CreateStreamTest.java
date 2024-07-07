package dirapp.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {

  // Macam-macam cara membuat Stream
  // Aliran data di Stream hanya bisa digunakan sekali


  // Mmebuat Stream langsung dengan class Stream<T>
  @Test
  void testCreateEmptyOrSingleStream() {

    Stream<String> emptyStream = Stream.empty();
    emptyStream.forEach(data -> {
      System.out.println(data);
    });

    Stream<String> oneStream = Stream.of("Dira");
    oneStream.forEach(data -> {
      System.out.println(data);
    });

    String data = "Sanjaya";
    Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    emptyOrNotStream.forEach(item -> {
      System.out.println(item);
    });
  }


  // Membuat Stream dari Array
  @Test
  void testCreateStreamFromArray() {
    Stream<String> arrayStream = Stream.of("Dira", "Sanjaya", "Wardana");
    arrayStream.forEach(name -> System.out.println(name));

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
    integerStream.forEach(System.out::println);

    String[] array = new String[]{
        "Dira", "Sanjaya", "Wardana"
    };
    Stream<String> streamFromArray = Arrays.stream(array);
    streamFromArray.forEach(System.out::println);
  }


  // Membuta Stream dari Collection
  @Test
  void testCreateStreamFromCollection() {
    Collection<String> collectionString = List.of("Dira", "Sanjaya", "Wardana");
    Stream<String> streamString = collectionString.stream();
    streamString.forEach(System.out::println);

    // Stream hanya bisa digunakan sekali, jika ingin menggunakan Stream lagi maka harus buat stream baru
    Stream<String> stringStream2 = collectionString.stream();
    stringStream2.forEach(System.out::println);
  }


  // Membuat Infinite Stream (Stream yang tidak ada ujungnya)
  // ketika Stream di jalankan, maka tidak akan berhenti, mirip seperti Infinite Loop
  // Hati-hati dalam penggunaan Infinite Stream
  @Test
  void testCreateInfiniteStream() {
    // ketika Stream di eksekusi dengan forEach, maka tidak akan berhenti dan selalu menghasilkan value "Dira"
    Stream<String> stream = Stream.generate(() -> "Dira");
    // stream.forEach(System.out::println);

    // ketika Stream di eksekusi dengan forEach, maka tidak akan berhenti dan selalu menghasilkan value 1 sampai seterusnya
    Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
    // iterate.forEach(System.out::println);
  }
}
