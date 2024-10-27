  fun main(){
    
   println(birthdayGreeting("Aditya"))
   println(birthdayGreeting("Mamita"))
  }



 fun birthdayGreeting(name: String):String{
   
  val nameGreeting = "Happy Birthday,$name"
 
  val ageGreeting_2="You are 23 years old"
  return "$nameGreeting\n$ageGreeting_2"
 }