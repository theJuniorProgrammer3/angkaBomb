import kotlin.random.Random

fun main() {
	//var random = Random(System.currentTimeMillis())
	//var angkaBomb: Int = random(1, 101)
	val angkaBomb: Int = Random.nextInt(1, 101)
	var rentanawal: Int  = 1 // rentam awal
	var rentanakhir: Int = 100 // rentan akhir
	var jawab: Int = 0
	var menang: Boolean = false
	while(jawab != angkaBomb) {
	if(rentanakhir - 1 == angkaBomb && rentanawal + 1 == angkaBomb) {
		menang = true
		break
	}
	println("Pilih, angka $rentanawal sampai $rentanakhir:")
	jawab = readLine()!!.toIntOrNull() ?: angkaBomb
	if(jawab > rentanakhir || jawab < rentanawal) {
		println("Yang benar donk!")
		System.exit(0)
	}
	if(jawab < angkaBomb) {
		rentanawal = jawab
	} else if(jawab > angkaBomb) {
		rentanakhir = jawab
	} else {
		break
	}
}
	if(menang == true) {
		println("Anda menang! :)")
	} else {
		println("Anda kalah! :(")
	}
}
