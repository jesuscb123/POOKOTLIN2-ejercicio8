data class Libro(val titulo: String, val autor: String, val numeroPaginas: Int, val calificacion: Int) {
    init{
        require(calificacion in 1..10) {"La calificación debe ser entre 1 y 10"}
    }



}