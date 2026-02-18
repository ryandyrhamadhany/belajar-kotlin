class Lamp {
    private var isOn: Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

//    fun displayLightStatus(Lamp: String){
//        if(isOn){
//            println("$Lamp Display On")
//        }else{
//            println("$Lamp Display Off")
//        }
//    }
    fun displayLightStatus(){
        if(isOn){
            println("Lamp On")
        }else{
            println("Lamp Off")
        }
    }
}

fun main() {
    val l1 = Lamp()
    val l2 = Lamp()

    l1.turnOn()
    l2.turnOff()

//    l1.displayLightStatus("L1")
//    l2.displayLightStatus("L2")

    l1.displayLightStatus()
}