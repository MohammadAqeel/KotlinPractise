

abstract class SuperNumber(realValue: Number) {
    private var realValue1=realValue


    abstract fun isSimple(): Boolean


//    Function is accessible in all subclasses
     fun getRealValue():Number {
         return realValue1
    }

    protected fun doSomething(){
//        ToDo
    }


}
