  fun main(){
    
   println(birthdayGreeting(age=24,name="Aditya"))
   println(birthdayGreeting(age=23,name="Mamita"))
  }



 fun birthdayGreeting(name: String,age:Int):String{
   
  val nameGreeting = "Happy Birthday,$name"
 
  val ageGreeting_2="You are $age years old"
  return "$nameGreeting\n$ageGreeting_2"
 }