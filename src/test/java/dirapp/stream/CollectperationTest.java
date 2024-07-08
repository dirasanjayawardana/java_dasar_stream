package dirapp.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CollectperationTest {
    // Collect operation adalah operasi untuk mengambil data Stream kemudian diubah menjadi struktur data yang diinginkan
    // Collection operation membutuhkan parameter operator, bisa dengan menggunakan class Collectors
    // Collect opeartion merupakan salah satu Treminal operation (akan triger aliran data stream)

    Stream<String> getStream() {
        return Stream.of("Dira", "Sanjaya", "Wardana");
    }


    @Test
    void testCollection() {
        // Collectors.toSet() --> ambil data Stream lalu diubah ke Set
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        // Collectors.toUnmodifiableSet() --> ambil data Stream lalu diubah ke Immutable Set
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        // Collectors.toList() --> ambil data Stream lalu diubah ke List
        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        // Collectors.toUnmodifiableList() --> ambil data Stream lalu diubah ke Immutable List
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);
    }


    @Test
    void testMap() {
        // Collectors.toMap(item -> functionUntukKey, item -> functionUntukValue) --> ambil data Stream lalu diubah ke Map
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> name,
                name -> name.length()));
        System.out.println(map);
    }


    @Test
    void testGroupingBy() {
        // Collectors.groupingBy(item -> GroupKey) --> mengambil data stream dan melakukan grouping
        // return dari Collectors.groupingBy() adalah Map<GroupKey, List<Value>>
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                })); // "Besar" dan "Kecil" akan menjadi GroupKey

        System.out.println(collect);
    }


    @Test
    void testPartitioningBy() {
        // Collectors.partitioningBy(item -> GroupKey) --> mengambil data dan melakukan grouping menjadi dua group (true dan false)
        // return dari Collectors.partitioningBy() adalah Map<GroupKey, List<Value>>
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(number -> {
                    return number > 5;
                })); // akan ada dua group, true dan false

        System.out.println(collect);
    }


    @Test
    void testGroupingBy2() {
        // Collectors.groupingBy(item -> GroupKey) --> mengambil data stream dan melakukan grouping
        // return dari Collectors.groupingBy() adalah Map<GroupKey, List<Value>>
        Map<String, List<String>> map = Stream.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi")
                .collect(Collectors.groupingBy(name -> {
                    if (name.length() > 4) {
                        return "Panjang";
                    } else {
                        return "Pendek";
                    }
                })); // "Panjang" dan "Pendek" akan menjadi GroupKey

        System.out.println(map);
    }


    @Test
    void testPartitioningBy2() {
        // Collectors.partitioningBy(item -> GroupKey) --> mengambil data dan melakukan grouping menjadi dua group (true dan false)
        // return dari Collectors.partitioningBy() adalah Map<GroupKey, List<Value>>
        Map<Boolean, List<String>> map = Stream.of("Eko", "Kurniawan", "Khannedy", "Budi", "Joko")
                .collect(Collectors.groupingBy(name -> {
                    return name.length() > 4;
                })); // akan ada dua group, true dan false

        System.out.println(map);
    }
}
