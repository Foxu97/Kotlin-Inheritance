class Square(val a: Double, val color: Color): Figure(), Printable{
    override val surfaceArea: Double
        get() {
            return a*a
        }

    override fun draw() {
       for(i in 0 until a.toInt()){
            if (i == 0 || i == a.toInt()-1){
                for(j in 0..a.toInt()-1){
                    print(color.rgb + "*")
                }
            }
           else{
                for(k in 0 ..a.toInt()){
                    if(k == 0 || k == a.toInt()-1){
                        print(color.rgb + "*")
                    }
                    else{
                        print(" ")
                    }
                }
            }
           println("\u001B[0m")
        }
    }

    override fun getPerimeter(): Double {
        return a*4
    }
}