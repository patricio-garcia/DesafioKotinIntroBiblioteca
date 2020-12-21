package cl.serlitoral.desafiokotinintrobiblioteca

//5. Crear función main de forma correcta
fun main() {

    //6. Declarar 4 variables de la clase “LibrosEscolares”
    var book1 = schoolBook("La Biblioteca De Papelucho",
        "9789563632606",
        2010,
        "SM Ediciones",
        1456,
        64900,
        "Marcela Paz",
        'I')

    var book2 = schoolBook("Álgebra 2° Edicion",
        "9789562782456",
        2019,
        "McGraw-Hill",
        568,
        31890,
        "Ximena Carreño",
        'I')

    var book3 = schoolBook("Manual De Psicología",
        "9789561228191",
        2018,
        "ZIG-ZAG",
        144,
        9990,
        "Adriana Figueroa",
        'D')

    val book4 = schoolBook("Orgullo y Prejuicio",
        "9788415618782", 2018,
        "Alma Libros",
        448,
        11800,
        "James Austen",
        'I')

    //7. Llamar a las funciones creadas y tener la salida de información por consola
    val booksList = listOf(book1, book2, book3, book4)
    for (book: schoolBook in booksList) {
        book.printBook()
    }
}
// 2. Crear la clase LibrosEscolares con todos los atributos solicitados
class schoolBook (
    val name: String,
    val ISBN: String,
    val publishYear: Int,
    val publisher: String,
    val pagesNumber: Int,
    val price: Int,
    val author: String,
    val bookType: Char
    )

