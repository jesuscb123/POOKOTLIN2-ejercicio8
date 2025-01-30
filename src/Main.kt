

fun main(){
    val conjuntoLibros1 = ConjuntoLibros()
    val libro1 = Libro("IT", "Stephen KING",100,5)
    val libro2 = Libro("Cien años de soledad","Gabriel García Márquez",600,10)

    val libro3 = Libro("1984", "George Orwell",400,9)


    conjuntoLibros1.añadirLibro(libro1)
    conjuntoLibros1.añadirLibro(libro2)
    conjuntoLibros1.eliminarLibro(libro1.titulo)
    conjuntoLibros1.eliminarLibro(libro2.autor)
    conjuntoLibros1.añadirLibro(libro3)
    conjuntoLibros1.mostrarLibros()



}