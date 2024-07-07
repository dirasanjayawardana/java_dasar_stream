# Java Stream
Java Stream ada sejak java 8 atau 1.8. Java stream adalah inplementasi di java untuk aliran data.
Stream adalah aliran data, berbeda dengan Array atau Collection yang merupakan kumpulan data.
Pada Stream fokus terhadap operasi apa yang akan dilakukan terhadap suatu data.
Aliran data pada Stream hanya bisa dilakukan satu kali, jika melakukan Stream lagi dengan Stream yang sama, maka operasi Stream akan error.
Secara Default Stream adalah Lazy, hanya akan di alirkan ketika dibutuhkan seperlunya saja, tergantung terminal operationnya
Data di Stream di eksekusi secara satu persatu sampai aliran selesai, data pertama dieksekusi sampai aliran selsai, baru dilanjutkan ekesekusi data ke dua dan seterusnya.

## Intermediate Operation
Merupakan lazy operation, dimana Stream tidak akan dieksekusi sampai memang dibutuhkan atau di trigger oleh Terminal Operation. Intermediate operation akan mengembalikan Stream lagi. contohnya `.map()`

## Terminal Operation
Merupakan operasi yg  men-Triger sebuah Stream mengalir atau dijalankan. contohnya `.forEach()`, `collect()`

Cara mengetahui apakah Operation sebuah Intermediate Operation atau Terminal Operation:
- Jika returnnya adalah Stream maka itu termasuk Intermediate Operation
- Jika returnnya selai Stream, misalnya void, maka itu termasuk Terminal Operation

## Membuat Stream
- Bisa membuat stream dari class `Stream<T>`
- Bisa membuat Stream langsung dari Array dengan `Arrays.stream(namaArray)` atau Collection dengan method `.stream()`
- Bisa membuat Infinite Stream (Stream yg tidak ada ujungnya) dengan `Stream.generate()` atau `Stream.Iterate()`
- Bisa membuat Stream dengan Stream Builder, Stream yg dibuat mirip seperti Collection, bisa menambahkan data ke Stream Builder, setelah selesai baru membuat Streamnya, dengan `Stream.builder()`

## Stream Operation
Merupakan kumpulan operasi-operasi yang bisa digunakan untuk memanipulasi Stream itu sendiri.
Stream Operation tidak akan memodifikasi data aslinya, melainkan hasil dari Stream Operation adalah Stream baru