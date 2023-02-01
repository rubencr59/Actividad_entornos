package `5`.`10`


fun main(args: Array<String>) {
    //val miBaraja= Baraja()
    //miBaraja.mostrar()
    val Cartas3 = Mano()
    Cartas3.mostrarcartas()
    println()
    println("¿Que carta quieres mostrar?")
    var posicion = readln().toInt()
    Cartas3.mostrarCarta(posicion-1)

    println("¿Que carta quieres modificar?")
    posicion = readln().toInt()
    println("¿Por cual?(Introduce primero el número)")
    println("numero == 1 -> As\n numero de 2 a 10 -> número normal\n numero == 11 -> Sota\n numero == 12 -> Caballo\n numero == 13 -> Rey")
    val Numero = readln().toInt()
    println("Ahora el palo:")
    println("palo == O -> Oros\n palo == C -> Copas\n palo == B -> Bastos\n  palo == E -> Espadas")
    val Palo = readln()!![0]
    val nuevacarta = Carta(Numero,Palo)
    Cartas3.actualizarCarta(posicion,nuevacarta )
    Cartas3.mostrarcartas()



    /*
    var listaCartas= mutableListOf<Cartas.Carta>()
    for (n in (1..13))
        for (p in (0..3)){
            /*
            val c=Cartas.Carta(n,Cartas.numeroAPalo(p))
            listaCartas.add(c)

             */
            listaCartas.add(Cartas.Carta(n,Cartas.numeroAPalo(p))  )
        }
    for (cartadelaLista in listaCartas){
        cartadelaLista.mostrarCarta()
    }

    /*
        val pepe=Alumno("77777777U",21)
        val ana=Alumno("88888888Y",41)


        pepe.notaTrimestre1=6
        pepe.notaTrimestre2=7
        pepe.notaTrimestre3=9

        //pepe.informeAlumno()
        ana.notaTrimestre1=4
        ana.notaTrimestre2=6

        ana.informeAlumno()
    */

     */
}
