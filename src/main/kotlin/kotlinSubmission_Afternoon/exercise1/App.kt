package kotlinSubmission_Afternoon.exercise1

/**
Latihan 1
Lengkapi fungsi KotlinSubmission_Afternoon.exercise1.myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable KotlinSubmission_Afternoon.exercise1.myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Andika Risky"
    val namaBelakang = "Faizatama"
    val umur = 21
    val status = false
    val statusText = if (status) "tidak single" else "single"

    println("Nama saya $namaDepan $namaBelakang umur $umur dan sekarang status saya $statusText")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi KotlinSubmission_Afternoon.exercise1.myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggota = listOf(
        "Andika Risky Faizatama",
        "Bestran Antony Hutabarat",
        "Muhammad Hasyim",
        "Revangga Prakusya Damanik",
        "Widya Ayu Lestari",
        "Ahmad Arya Perdana",
        "Alan Juman Masaid ",
        "Cherlin Vinanditha",
        "I Made Surya Widjaya Putra",
        "Halena Diyana Sedar",
        "M. Taufiq Hidayat")
    return listOf(anggota[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi KotlinSubmission_Afternoon.exercise1.totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf(
        "M.Hanif Annafi",
        "Sarif Hidayatullah",
        "Abdee",
        "Armando Mendoza Putra",
        "Ayat",
        "Budi Prasetio",
        "Chaeru Rachmadi Putra",
        "Desti",
        "Hasan Harahap",
        "Irvantoni llham",
        "Jovian",
        "JOY",
        "Malik",
        "Megy Permana",
        "Permana Aji Syahputra",
        "Reynaldi",
        "_Atun",
        "Hizkia Yogi Rafael",
        "Zulhan",
        "Budi Prayoga",
        "Iffan Azra",
        "Bill Jeferson"
    )
    val countOfGroup = arrayOf("Andika Risky Faizatama",
        "Bestran Antony Hutabarat",
        "Muhammad Hasyim",
        "Revangga Prakusya Damanik",
        "Widya Ayu Lestari",
        "Ahmad Arya Perdana",
        "Alan Juman Masaid ",
        "Cherlin Vinanditha",
        "I Made Surya Widjaya Putra",
        "Halena Diyana Sedar",
        "M. Taufiq Hidayat")

    return mentor.size+countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi KotlinSubmission_Afternoon.exercise1.groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Celestial",

        listOf("Andika Risky Faizatama",
        "Bestran Antony Hutabarat",
        "Muhammad Hasyim",
        "Revangga Prakusya Damanik",
        "Widya Ayu Lestari",
        "Ahmad Arya Perdana",
        "Alan Juman Masaid ",
        "Cherlin Vinanditha",
        "I Made Surya Widjaya Putra",
        "Halena Diyana Sedar",
        "M. Taufiq Hidayat"),

        "Afternoon")

}