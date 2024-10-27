  fun main(){
    
   println(birthdayGreeting(name="Aditya",age=24))
   println(birthdayGreeting(name="Mamita",age=23))
  }



 fun birthdayGreeting(name: String,age:Int):String{
   
  val nameGreeting = "Happy Birthday,$name"
 
  val ageGreeting_2="You are $age years old"
  return "$nameGreeting\n$ageGreeting_2"
 }