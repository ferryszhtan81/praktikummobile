class kucing(var Nama: String, var Jenis: String, var Umur: Int, var Kelamin: String){
    fun SukaKucing(){ println("Saya suka banget dengan kucing") }
}
class tupai(var Nama: String,var Jenis: String, var Umur: Int, var Kelamin: String){
    fun SukaTupai(){ println("Dan tupai yang kumiliki! Mereka itu hewan menggemaskan.")}
}
fun main() {
    val kucing = kucing("Ruak", "Kucing", 2, "Jantan")
    val tupai = tupai("Hala", "Tupai", 4, "Betina")
    var hallo = object {
        val Hai = "Hai semuanya, "
        val Roland = "ini Ferry Roland"
        override fun toString(): String = "$Hai$Roland"
    }
    println("$hallo, saya ingin mau kasih tau nih")
    println("Kalau saya punya ${kucing.Jenis} yang bernama ${kucing.Nama}. ")
    println("Dia berumur ${kucing.Umur} tahun dan dia adalah kucing ${kucing.Kelamin}.")
    println("Selain itu, saya juga memliki ${tupai.Jenis} yang bernama ${tupai.Nama}.")
    println("Dia lebih tua daripada ${kucing.Jenis}ku, dia itu berumur ${tupai.Umur}, ")
    println("Dan dia itu adalah tupai ${tupai.Kelamin} yang hebat.")
    kucing.SukaKucing(); tupai.SukaTupai()
}
