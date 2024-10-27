  fun main(){
    
   println(birthdayGreeting("Aditya",24))
   println(birthdayGreeting("Mamita",23))
  }



 fun birthdayGreeting(name: String,age:Int):String{
   
  val nameGreeting = "Happy Birthday,$name"
 
  val ageGreeting_2="You are $age years old"
  return "$nameGreeting\n$ageGreeting_2"
 }