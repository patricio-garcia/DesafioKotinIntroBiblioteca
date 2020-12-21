package cl.serlitoral.desafiokotinintrobiblioteca

//3. Crear función “precioFormateado” de forma correcta
fun formatPrice(pPrice: Int): String {
    return "$$pPrice"
}

//4. Crear función “imprimir” de forma correcta
fun schoolBook.printBook() {
    println("Título: $name")
    println("ISBN: $ISBN")
    println("Año de publicación: $publishYear")
    println("Editoral: $publisher")
    println("Número de páginas: $pagesNumber")
    println("Precio: ${formatPrice(price)}")
    println("Autor: $author")
    println("Tipo de Libro: $bookType")
    println("----------------------------------------------")
}


