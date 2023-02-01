package `5`.`10`

class Mano() {
    var Tamaño = 0
        get() {
            return field
        }
        set(valor: Int) {
            if (valor < 0) {
                field = 1
            } else {
                field = valor
            }
        }


    var Cartas = arrayListOf<Carta>()


    init {
        this.Tamaño = 3
        for (i in 0..Tamaño - 1) {
            val n = (1..13).random()
            val p = (0..3).random()
            Cartas.add(Carta(n, numeroAPalo(p)))
        }
    }

    fun mostrarcartas() {
        print("mostrar 3 cartas\n")
        for (cartadelaLista in Cartas) {
            cartadelaLista.mostrarCarta()
        }
        print("fin mostrar 3 cartas")

    }

    fun obtenerTamaño() {
        println(Cartas.size)
    }

    fun mostrarCarta(Posicion: Int) {

        Cartas[Posicion].mostrarCarta()


    }

    fun actualizarCarta(Posicion: Int, Carta: Carta) {
        if (Posicion >= 0 && Posicion < Cartas.size) {
            Cartas[Posicion-1] = Carta  //Cambiar una carta por la carta asignada.
        }
    }
    fun manoGanadora (Otramano: Mano) {
        var acumulaVictorias= 0
        for (i in (0..Cartas.size-1)){
            acumulaVictorias += Cartas[i].compararCarta(Otramano.Cartas[i])

        if (acumulaVictorias<0){
            this.mostrarcartas()
        }
        else {
            Otramano.mostrarcartas()
        }
        }
    }
}

private operator fun Int.plusAssign(compararCarta: Unit) {
    TODO("Not yet implemented")
}

