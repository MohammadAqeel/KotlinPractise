

abstract class SuperNumber(private val realValue: Number) {



    abstract fun isSimple(): Boolean


//    Function is accessible in all subclasses
     fun getRealValue():Number {
         return realValue
    }

    protected fun doSomething(){
//        ToDo
    }


}
