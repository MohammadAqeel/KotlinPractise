open class ComplexNumber(var real:Double, var imaginary:Double): SuperNumber(real) {

// this function is public by default

    protected fun getComplexFormat():String{
        return "$real+$imaginary"+"i"
    }
    //Overriding
    override fun isSimple(): Boolean {
        return imaginary==0.0
    }
//    Private function can be accesses only in this class
    private fun calcWhatEver():Number{
        return 0
    }


}