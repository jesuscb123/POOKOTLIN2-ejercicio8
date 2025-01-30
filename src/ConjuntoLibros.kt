class ConjuntoLibros() {
    val conjuntoLibros = Array<Libro?>(MAX_LIBROS) { null }
    var librosAñadidos = 0

    companion object {
        const val MAX_LIBROS = 3
    }

    fun añadirLibro(libro: Libro): Boolean {
        if (librosAñadidos <= MAX_LIBROS) {
            for (i in 0..conjuntoLibros.size - 1) {
                if (conjuntoLibros[i] == null) {
                    conjuntoLibros[i] = libro
                    librosAñadidos++
                    return true
                }
            }
        }
        return false
    }

    fun eliminarLibro(tituloAutor: String) {
        for (i in 0..conjuntoLibros.size - 1) {
            if (conjuntoLibros[i]?.titulo == tituloAutor || conjuntoLibros[i]?.autor == tituloAutor) {
                conjuntoLibros[i] = null
                librosAñadidos--
            }
        }
    }

    fun mostrarLibros() {
        val librosOrdenados = conjuntoLibros.sortedByDescending { it?.calificacion }
        for(libro in librosOrdenados){
           if(libro != null){
               println(libro)
           }
        }
    }
}







