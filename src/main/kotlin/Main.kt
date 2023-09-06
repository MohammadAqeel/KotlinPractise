import kotlin.jvm.internal.Intrinsics.Kotlin

fun main(args: Array<String>) {
//    println(calculateDivideReminder(10.25,23.0))

//    println(characterFrequency("AllFilesAreHereAA",'a'))

//    println(removeWhiteSpaces(" All Files Are Here "))

//    println(isCharVowel('u'))

//println(findMax(5,2,3,4))

//println(factorial(-4))
//////////////////////////////////////////////////////
//    val complex1=ComplexNumber(1.0,1.0)
//    val complex2=ComplexNumber(1.0,1.0)
//    val complex3=ComplexNumber(1.0,1.0)
//    val complex4=ComplexNumber(1.0,1.0)
//    val listOfComplexNumber= mutableListOf<ComplexNumber>()
//    listOfComplexNumber.add(complex1)
//    listOfComplexNumber.add(complex2)
//    listOfComplexNumber.add(complex3)
//    listOfComplexNumber.add(complex4)
//    val complexAdded=listOfComplexNumber.addComplex()
//    println(complexAdded.getComplexFormat())
////////////////////////////////////////////////////////
//    val intValue=1247435
//println(intValue.calcDigits())

//    val str=removeWhiteSpaces("a b c d e f a g t h g g g ")
//    val lists=str.calcFrequencyOfEachChar()
//   println(lists[0])
//    println(lists[1])

//    this is going to throw an exception because it is a custom Integer type
//    val superNumber=IntNumber(2000000001)


//val myComplexNumber=ComplexNumber(12.0,0.1)
//val myNumber=IntNumber(12)
//    println(myComplexNumber.getRealValue())

//println(defaultNamedParameters(value2="HyperMode"))

//    val list=(1..25).toList()
//    val newList=list.customFilter { it%2!=0}
//    println(newList)

//    val intList=(1..10).toList()
//    val newList=intList.customSum { it<=3 ||it >9 }  //it<=3 ||it >9// true //false // condition// && //|| all can be used
//println(newList)


//    val list=(1..25).toList()
//    println(list.customFilterAllTypes { it in 11..19 })


//    val array= arrayOf("str1","str2","str3")
//    val numArray= arrayOf(1,2,3,4,5,6,7,8,9,0)
//    numArray.printArray()

//    val triple=CustomTriple<Int,String,Double>(12,"Str",2.3)
//    val int=triple.getFirst()
//    val intType=triple.getFirstType()
//    println(intType)

//val list= mutableListOf(1L,2L,3L,2.0,20)
//   println(list.customSumNumber { true })



}
// Extension Functions
fun List<ComplexNumber>.addComplex():ComplexNumber{
    val complex=ComplexNumber(0.0,0.0)
    for (item in this){
        complex.real+=item.real
        complex.imaginary+=item.imaginary
    }
    return complex
}
fun Int.calcDigits(): Int{
    var intValue=this
    var counter:Int=0
    while (intValue>0){
        intValue/=10
        counter++
    }
    return counter
}
fun String.calcFrequencyOfEachChar(): List<List<Any>>{
val len=this.length
    val characterList= mutableListOf<Char>()
    val frequencyList= mutableListOf<Int>()
//    add characters to string list
    for (i in 0..<len){
        if(!(characterList.contains(this[i]))){
            characterList.add(this[i])
            frequencyList.add(0)
        }
    }
    for (i in 0..<characterList.size){
        for (j in 0..<len){
            if(characterList[i]==this[j])
                frequencyList[i]+=1
        }
    }
return listOf(characterList,frequencyList)
}
//////////////////////////////
//Basic Kotlin
fun characterFrequency(str:String,character:Char): Int {
    var counter:Int=0
    for (i in 0 until str.length)
        if(str[i]==character)
            counter++
    return counter
}
fun calculateDivideReminder(value1 :Double, value2: Double): List<Double>{
    val max:Double= mutableListOf(value1,value2).max()
    val min:Double = mutableListOf(value1,value2).min()
    var reminder:Double =max
    var count:Double=0.0
if(max>min)
    while (reminder>=min ){
        reminder-=min
        count++
    }
    return mutableListOf<Double>(count,reminder)
}
fun removeWhiteSpaces(str:String) :String {
    var newStr:String =""
    for(i in 0 until str.length)
        if(str[i]!= ' ')
            newStr+=str[i]
    return newStr

}
fun isCharVowel(character: Char) :Boolean{
    // Two ways are implemented.
//    val vowels:CharArray=charArrayOf('a','i','u','o','e')
//
//   for (ch in vowels){
//       return ch==character
//   }
    return when(character){
        'a','e','o','i','u' -> true
        else -> false
    }
//return false
}
fun factorial(number:Int):Int{
    return if (number>0) {
        var result:Int=number
        var counter:Int=number-1
        while (counter > 0) {
            result *= (counter)
            counter--
        }
        result
    }else{
        -1
    }
}
fun defaultNamedParameters(value:Int=0, value2 :String="Default"): String{
    return if(value==0 && value2=="Default")
        "Default Mode is On"
    else "Default Mode is Off"
}
//OverLoading
fun findMax(vararg numbers: Int ): Int{
    var max:Int=0
    for (num in numbers)
        if (num>max)
            max=num
    return max
}
fun findMax(vararg numbers: Double ): Double{
    var max:Double=0.0
    for (num in numbers)
        if (num>max)
            max=num
    return max
}
fun findMax(vararg numbers: Long ): Long{
    var max:Long=0
    for (num in numbers)
        if (num>max)
            max=num
    return max
}
fun findMax(vararg numbers: Float ): Float{
    var max:Float=0F
    for (num in numbers)
        if (num>max)
            max=num
    return max
}
//////////////////////////////
// Lambda Functions
fun List<Int>.customFilter(myFilter:(Int) ->(Boolean)): List<Int>{
    val resultList= mutableListOf<Int>()
    for(item in this){
        if (myFilter(item))
            resultList.add(item)
    }
    return resultList
}
fun List<Int>.customSum(func:(Int)->Boolean):Int{
    var sum:Int=0
    for (item in this){
        if(func(item))
            sum+=item
    }
    return sum
}
fun List<Number>.convertListToInt():List<Int>{
    val newList= mutableListOf<Int>()
    for (item in this){
        newList.add(item.toInt())
    }
    return newList
}
fun List<Number>.convertListToDouble():List<Double>{
    val newList= mutableListOf<Double>()
    for (item in this){
        newList.add(item.toDouble())
    }
    return newList
}
//Generics

fun <T> List<T>.customFilterAllTypes(filter: (T)->(Boolean)):List<T>{
    val  newList=mutableListOf<T>()
    for (item in this)
        if (filter(item))
            newList.add(item)


    return newList
}
fun <T> Array<T>.printArray(){
    var stringArray=""
    for (i in indices){
        if(i!=this.size-1){
            stringArray+="${this[i]},"
        }
        else{
            stringArray+=this[i]
        }
    }
    println("[$stringArray]")
}

//reified is used to make T type available at run time
// because the functions are running in blocks and in order to make the T type available
// we need to make the function inline. so that it runs in the same inline (not called)
// this function will be able to add all type of numbers,
// but we may get a problem in the inside functions(Condition)
inline fun <reified T:Number>List<T>.customSumNumber(func:(T)->Boolean):T{
var sum:Number =0
for (item in this)
    if (func(item)){
        sum =when(item){
            is Int ->sum.toInt().plus(item.toInt())
            is Double ->sum.toDouble().plus(item.toDouble())
            is Float ->sum.toFloat().plus(item.toFloat())
            is Long->sum.toLong().plus(item.toLong())
            is Byte->sum.toByte().plus(item.toByte())
            else ->throw IllegalArgumentException("Unsupported type")
        }
    }
    return sum as T
}






