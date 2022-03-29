import model.Serie
import model.VideoJuego

fun main(args: Array<String>) {

    var serie = arrayOf<Serie>()

    var videojuego = arrayOf<VideoJuego>()

    var serie1 = Serie("SAW", "JUAN")
    var serie2 = Serie("RESIDENT EVIL",6,"SUSPENSO", "ROGER")
    var serie3 = Serie("JAWS",3,"DRAMA", "PEPE")
    var serie4 = Serie("CARS",2,"COMEDIA", "LUIS")
    var serie5 = Serie("SHARK", "ROBERTO")

    var videojuego1 = VideoJuego("DRAGON BALL",20)
    var videojuego2 = VideoJuego("YG-GI-OH", 40)
    var videojuego3 = VideoJuego("CRASH",20,"AVENTURA","KONAMI")
    var videojuego4 = VideoJuego("FIFA",100, "AVENTURA", "EA GAMES")
    var videojuego5 = VideoJuego("PES10",40, "DEPORTES", "KONAMI")

    serie1.entregar()
    serie5.devolver()
    serie2.devolver()
    serie1.isEntregado()

    videojuego1.entregar()
    videojuego4.entregar()
    videojuego3.devolver()
    videojuego1.isEntregado()

    serie = serie.plus(serie1)
    serie = serie.plus(serie2)
    serie = serie.plus(serie3)
    serie = serie.plus(serie4)
    serie = serie.plus(serie5)


    videojuego = videojuego.plus(videojuego1)
    videojuego = videojuego.plus(videojuego2)
    videojuego = videojuego.plus(videojuego3)
    videojuego = videojuego.plus(videojuego4)
    videojuego = videojuego.plus(videojuego5)


    println("Serie"+serie.size)
    println("VideoJuego"+videojuego.size)
    var contador1 : Int = 0
    var contador2 : Int = 0

    for (i in serie){
        if(i.entregado == true){
            contador1 ++
        }
    }
    println("El total de series entregadas es: $contador1")

    for (i in videojuego){
        if(i.entregado == true){
            contador2 ++
        }
    }
    println("El total de VideoJuegos entregados es: $contador2")






    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}