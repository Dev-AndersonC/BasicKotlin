class Person(
var name : String,
var idade : Int,
var email : String



)


fun main() {
    val pessoa = Person("Anderson",21,"andersoncsilva.com")
    println(pessoa.name + " " + pessoa.idade + " " + pessoa.email)
}