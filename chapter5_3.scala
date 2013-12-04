
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    (hours < other.hours) || (hours == other.hours && minutes < other.minutes)
  }
}


val newTime = new Time(14, 45)
val secondTime = new Time(16, 55)
val thirdTime = new Time(14, 55)

println(newTime.before(secondTime))
println(newTime.before(thirdTime))
println(secondTime.before(thirdTime))

