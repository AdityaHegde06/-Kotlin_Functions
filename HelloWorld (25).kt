  fun main(){
    
   println(birthdayGreeting("Aditya"))
  }



 fun birthdayGreeting(name: String):String{
   
  val nameGreeting = "Happy Birthday,$name"
  val ageGreeting = "You are 24 years old"
  
  return "$nameGreeting\n$ageGreeting"
 }