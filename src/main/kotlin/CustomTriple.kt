import kotlin.reflect.KClass


//Generics.



class CustomTriple <A:Any,B:Any,C:Any>(
    private var first:A,
    private var second:B,
    private var third:C
){
//in this case A,B and C can be null.
    // and to prevent that
    // we can simply add A:Any this means accept any type
//Any means all types except null
// Any? means only null

    fun getFirst():A{
    return first
    }
    fun getSecond():B{
        return second
    }
    fun getThird():C{
        return third
    }

    fun <reified> getFirstType(): KClass<out A> {
        return first::class
    }
    fun getSecondType(): KClass<out B> {
        return second::class
    }
    fun getThirdType(): KClass<out C> {
        return third::class
    }
}