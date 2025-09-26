fun main(){
//    🔹 Soal 1: Nilai Ujian
    println("\n=== Soal 1 ===")

//    Seorang siswa mendapat nilai ujian.
//    - Jika nilainya ≥ 90 cetak "Nilai A"
//    - Jika nilainya ≥ 75 cetak "Nilai B"
//    - Jika nilainya ≥ 60 cetak "Nilai C"
//    - Jika nilainya di bawah 60 cetak "Tidak lulus"
//    Buat program Kotlin dengan if else untuk menentukan kategori nilai siswa.
    val nilai = 88

    if (nilai >= 90){
        println("Nilai A")
    }else if (nilai >= 75){
        println("Nilai B")
    }else if (nilai >= 60){
        println("Nilai C")
    }else{
        println("Tidak Lulus")
    }

//    🔹 Soal 2: Genap atau Ganjil
    println("\n=== Soal 2 ===")
//    Ali ingin tahu apakah angka yang dia input adalah genap atau ganjil.
//    Buat program yang menerima angka, lalu cetak "Genap" atau "Ganjil" menggunakan if sebagai ekspresi.
    val angka = 5
    if (angka % 2 == 0) println("Angka Genap") else println("Angka Ganjil")

//    🔹 Soal 3: Hari dalam Minggu
    println("\n=== Soal 3 ===")
//    Dina memberi angka dari 1–7.
//    1 → "Senin"
//    2 → "Selasa"
//    …
//    7 → "Minggu"
//    Jika angka tidak ada di 1–7, cetak "Hari tidak valid".
//    Gunakan when untuk menyelesaikan soal ini.
    val number = 3

    when (number) {
        1 -> println("Senin")
        2 -> println("Selasa")
        3 -> println("Rabu")
        4 -> println("Kamis")
        5 -> println("Jumat")
        6 -> println("Sabtu")
        7 -> println("Minggu")
        else -> println("hari tidak valid!")
    }

//    🔹 Soal 4: Penilaian Huruf
    println("\n=== Soal 4 ===")
//    Seorang guru memberi nilai huruf pada siswa.
//    'A' atau 'B' → "Lulus dengan baik"
//    'C' → "Lulus pas-pasan"
//    'D' atau 'E' → "Tidak lulus"
//    Buat program Kotlin dengan when untuk mengecek hasil nilai huruf.
    val grade = 'B'

    when(grade){
        'A', 'B' -> println("Lulus dengan baik")
        'C' -> println("Lulus pas pasan")
        'D', 'E' -> println("Tidak lulus")
        else -> println("Nilai tidak valid")
    }

//    🔹 Soal 5: Musim Berdasarkan Bulan
    println("\n=== Soal 5 ===")
//    Bulan 1–12 akan menentukan musim:
//    12, 1, 2 → "Musim Hujan"
//    3, 4, 5 → "Musim Semi"
//    6, 7, 8 → "Musim Panas"
//    9, 10, 11 → "Musim Gugur"
//    Gunakan when sebagai ekspresi untuk menentukan musim dari sebuah bulan.
    val month = 12
    val season = when (month){
        12,1,2 -> "Musin Hujan"
        3,4,5 -> "Musim Semi"
        6,7,8 -> "Musim Panas"
        9,10,11 -> "Musim Gugut"
        else -> "Bulan tidak valid"
    }
    println(season)
}