fun main() {
   /* //HowBigIsMyPizza
    println("Introdueix el radi del teu cercle")
    var radius= readln().toDouble()
    var area=0.0

    area=Math.PI*(radius*radius)
    println("La pizza tine un $area")

    //AirVolumeCalculator
    println("Introduce en este orden el ancho, largo y altura de la habitación:")
    var ancho = readln().toDouble()
    var largo = readln().toDouble()
    var altura= readln().toDouble()
    var volum=0.0
    volum= ancho*largo*altura
    println(volum)

    //IsLegalAge
    println("Introduce tu edad")
    var edat = readln().toInt()

    if(edat<18) {
     println("No eres mayor de edad!")
    }
    else
    {
        println("Eres mayor de edad!")
    }

    //IsGreater
    println("Introduce dos numeros enteros.")
    var useNumb1 = readln().toInt()
    var useNumb2 = readln().toInt()

    if(useNumb2<useNumb1) {
        println("$useNumb1 es más grande")
    }
    else
    {
        println("$useNumb2 es más grande")
    }
    */
    //IsValidNote
    println("Introduce un numero entero")
    var dinerito = readln().toInt()
    if(dinerito==5 || dinerito==10||dinerito==20||dinerito==50||dinerito==100||dinerito==200||dinerito==500) {
        println("Coincide con un billete existente")
    }
    else{println("No coincide con un billete existente")}
    //IsDivisible
    println("Introduce dos numeros enteros.")
    var useNumb1 = readln().toInt()
    var useNumb2 = readln().toInt()

    if (0==useNumb1%useNumb2)
    {
        println("Els dos numeros son divisibles")}
    //IsTeenager
    println("Introduce tu edad")
    var edat = readln().toInt()
    if (edat in 10..20)
    {
        println("L'edat esta entre 10 i 20")}

    //BirthdayCelebrated
    println("Introdueix la teva data de neixement")

}
