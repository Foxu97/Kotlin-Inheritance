class Rectangle(val a: Double, val b: Double, val color: Color ) : Figure(), Printable {
    override val surfaceArea: Double
        get() {
            return a*b;
        }

    override fun getPerimeter(): Double {
        return 2*a + 2*b
    }

    override fun draw() {
        for(i in 0 until a.toInt()){
            if (i == 0 || i == a.toInt()-1){
                for(j in 0 until b.toInt()){
                    print(color.rgb +  "*")
                }
            }
            else{
                for(k in 0 until b.toInt()){
                    if(k == 0 || k == b.toInt()-1){
                        print( color.rgb + "*")
                    }
                    else{
                        print(" ")
                    }
                }
            }
            println("\u001B[0m")
        }
    }

}