open class Log{
    var data: String = ""
    var numberOfData = 0

    constructor(_data: String, _numberOfData: Int){
        this.data = _data
        this.numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog ->"+_data, 10){
      // constructor ini akan masuk ke constructor kedua dibawah
    }
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData){

    }
}

fun main() {
    val p1  = AuthLog("Bad Password")
}