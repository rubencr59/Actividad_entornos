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


    var Cartasdemano = arrayListOf<Carta>()


    init {
        this.Tamaño = 3
        for (i in 0..Tamaño - 1) {
            val n = (1..13).random()
            val p = (0..3).random()
            Cartasdemano.add(Carta(n, numeroAPalo(p)))
        }
    }

    fun mostrarcartas() {
        print("mostrar 3 cartas\n")
        for (cartadelaLista in Cartasdemano) {
            cartadelaLista.mostrarCarta()
        }
        print("fin mostrar 3 cartas")

    }

    fun obtenerTamaño() {
        println(Cartasdemano.size)
    }

    fun mostrarCarta(Posicion: Int) {

        Cartasdemano[Posicion].mostrarCarta()


    }

    fun actualizarCarta(Posicion: Int, Carta: Carta) {
        if (Posicion >= 0 && Posicion < Cartasdemano.size) {
            Cartasdemano[Posicion-1] = Carta  //Cambiar una carta por la carta asignada.
        }
    }
    fun manoGanadora (Otramano: Mano) {
        var acumulaVictorias= 0
        for (i in (0..Cartasdemano.size-1)){
            acumulaVictorias += Cartasdemano[i].compararCarta(Otramano.Cartasdemano[i])

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

