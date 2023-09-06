class IntNumber(realValue:Int):SuperNumber(realValue) {


init {
    if (realValue>Credentials.MAX_INT_VALUE || realValue<Credentials.MIN_INT_VALUE)
        throw ThrowMyIntExceptions()
}

//Overriding
    override fun isSimple(): Boolean {
        return true
    }

// Custom Exception Class
class ThrowMyIntExceptions(): Exception("Integer Value is Greater Than It Should Be"){


}

}