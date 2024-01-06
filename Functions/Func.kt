fun main() {

// println(Somar(10,10,20))
// println(Dividir(10,10,20))
// println(Multiplicar(10,10,20))
// println(Diminuir(10,10,20))


    while (true){
        var entryNumeros = 



        println("Deseja continuar? [S/N]")
        var entry = readln()
        if (entry.uppercase() == "S"){
            continue
        } else {
            println("Fechando programa...")
            break
        }
    }

}

fun Somar(vararg numeros: Int): Int{
    var res = 0
    for (number in numeros) {
        res += number
    }
    return res
}
fun Diminuir(vararg numeros: Int): Int{
    var res = 1
    for (number in numeros) {
        res -= number
    }
    return res
}

fun Dividir(vararg numeros: Int): Int{
    var res = 1
    for (number in numeros) {
        res /= number
    }
    return res
}

fun Multiplicar(vararg numeros: Int): Int{
    var res = 1
    for (number in numeros) {
        res *= number
    }
    return res
}