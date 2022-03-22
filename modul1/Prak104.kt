class kucing(var Nama: String, var Jenis: String, var Umur: Int, var Kelamin: String){

}
class tupai(var Nama: String,var Jenis: String, var Umur: Int, var Kelamin: String){

}
fun main() {
    val kucing = kucing("Ruak", "Kucing", 2, "Jantan")
    val tupai = tupai("Hala", "Tupai", 4, "Betina")

    println("Hai, saya mempunyai ${kucing.Jenis} yang bernama ${kucing.Nama}. " +
            "Dia berumur ${kucing.Umur} tahun dan dia adalah kucing ${kucing.Kelamin}.")
    println("Selain itu, saya juga memliki ${tupai.Jenis} yang bernama ${tupai.Nama}. " +
            "Dia lebih tua daripada ${kucing.Jenis}ku, dia itu berumur ${tupai.Umur} dan dia itu adalah tupai ${tupai.Kelamin}.")
}
