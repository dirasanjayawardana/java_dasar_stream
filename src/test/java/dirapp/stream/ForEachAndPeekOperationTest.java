package dirapp.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachAndPeekOperationTest {
    // forEach(T -> void) --> merupakan terminal operation (triger aliran data stream)
    // peek(T -> Stream) --> merupakan intermediate operation (hanya mengembalikan stream tanpa mentriger aliran data stream)

    @Test
    void testPeekBefore() {
      List.of("Dira", "Sanjaya", "Wardana").stream()
          .map(name -> {
            System.out.println("Before Change Name to Upper : " + name);
            String upper = name.toUpperCase();
            System.out.println("Change Name to Upper : " + upper);
            return upper;
          })
          .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
      List.of("Dira", "Sanjaya", "Wardana").stream()
          .peek(name -> System.out.println("Before Change Name to Upper : " + name))
          .map(name -> name.toUpperCase())
          .peek(upper -> System.out.println("Change Name to Upper : " + upper))
          .forEach(name -> System.out.println("Final Name : " + name));
    }
}
