class Circle(val r: Double): Figure() {
    override fun getPerimeter(): Double {
        return 2 * Math.PI * r
    }

    override val surfaceArea: Double
        get() {
            return Math.PI * r * r
        }
}