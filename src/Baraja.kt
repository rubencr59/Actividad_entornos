package `5`.`10`

class Baraja {
    var listaCartas= mutableListOf<Carta>()

    init{
        for (n in (1..13))
            for (p in (0..3)){
                /*
                val c=Cartas.Carta(n,Cartas.numeroAPalo(p))
                listaCartas.add(c)

                 */
                listaCartas.add(Carta(n, numeroAPalo(p)))
            }

    }
    fun mostrar(){
        print("Se va a mostrar la baraja española: ")
        for (cartadelaLista in listaCartas){
            cartadelaLista.mostrarCarta()
        }
        print("Fin mostrar baraja española.")
    }
}