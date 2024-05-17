fun main(){
    val person = People("Faith",90)
    person.sleep()

    val banker = Banker("Daniel",90)
    banker.sleep()

    banker.introduction("Paul")
}

open class People(var name:String, var age: Int){
    fun eat(){
        println("yumm")
    }

    open fun sleep(){
        println("zzzzz")
    }
    fun bank(){
        println("Chop money")
    }
    open fun introduction(){
        println("Hello my name is $name")
    }
}

class Banker(name: String,age: Int): People(name,age){
   override fun sleep(){
//       super.eat()
       println("mmmh")
   }

//    override fun introduction(name2: String) {
//        println("Hi my name is name2")
//    }

}


class Doctor(name: String, age: Int){
//    override fun introduction(){
//        println("Hi my name is ")
//    }

}

