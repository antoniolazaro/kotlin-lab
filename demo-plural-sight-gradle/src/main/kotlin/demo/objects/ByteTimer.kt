package demo.objects

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer()
    timer.time = timerValue
    println(timer.time)
}

class ByteTimer() {
    var time: Int = 0
    set(time){
        if(time < -128){
            field = -128
        }else if(time > 127){
            field = 127
        }else{
            field = time
        }
    }
}