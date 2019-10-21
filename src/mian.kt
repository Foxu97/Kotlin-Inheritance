fun main() {
    val figures = mutableListOf<Figure>()
    figures.add(Square(8.0, Color.RED))
    figures.add(Rectangle(3.0, 4.0, Color.BLUE))
    figures.add(Circle(5.0))

    for(figure in figures){
        if(figure is Printable){
            figure.draw()
        }
    }

    var sum = 0.0
    figures.forEach{sum += it.surfaceArea}
    println("Suma pól wynosi: $sum")

    var perimetersSum = figures.count({it -> it.getPerimeter() > 10});
    println("Ilosc obwodow wiekszych niz 10: $perimetersSum")

}