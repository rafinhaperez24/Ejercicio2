package model

class Serie : Entregable{
    var titulo: String= ""
        get() = field
        set(titulo) {
            field = titulo
        }
    var temporadas: Int= 3
        get() = field
        set(temporadas) {
            field = temporadas
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
    var creador: String= ""
        get() = field
        set(creador) {
            field = creador
        }



    constructor(titulo: String, temporadas: Int, genero: String, creador: String) {
        this.titulo = titulo
        this.temporadas = temporadas
        this.genero = genero
        this.creador = creador
    }

    constructor()
    constructor(titulo: String, creador: String) {
        this.titulo = titulo
        this.creador = creador
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