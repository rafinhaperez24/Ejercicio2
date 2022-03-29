package model

class VideoJuego : Entregable{
    var titulo: String= ""
        get() = field
        set(titulo) {
            field = titulo
        }
    var horas: Int= 10
        get() = field
        set(horas) {
            field = horas
        }
    var entregado : Boolean = false
        get() = field
        set(entregado) {
            field = entregado
        }
    var genero: String= ""
        get() = field
        set(genero) {
            field = genero
        }
    var compannia: String= ""
        get() = field
        set(compannia) {
            field = compannia
        }

    constructor()
    constructor(titulo: String, horas: Int) {
        this.titulo = titulo
        this.horas = horas
    }

    constructor(titulo: String, horas: Int, genero: String, compannia: String) {
        this.titulo = titulo
        this.horas = horas
        this.genero = genero
        this.compannia = compannia
    }


    override fun entregar() {
        entregado = true
    }

    override fun devolver() {
        entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }
}