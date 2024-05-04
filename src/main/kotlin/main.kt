import java.util.*
fun randomDay():String{
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday",
        "Friday", "Saturday", "Sunday")
    /* The nextInt() function takes an integer limit, which limits the
     number from Random() to 0 through 6 to match the week array.*/
    return week[Random().nextInt(week.size)] //
}
fun fishFood(day:String) : String{

    return when(day){
        "Monday" ->  "Flakes"
        "Tuesday" ->  "Pellets"
        "Wednesday" ->  "Redworms"
        "Thursday" -> "Granules"
        "Friday" ->  "Mosquitoes"
        "Saturday" ->  "Lettuce"
        "Sunday" -> "Plankton"
        else -> "Nothing"
    }
}
fun feedFish(){
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}
fun main(){
    feedFish()
}

