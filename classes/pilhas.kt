class PiLha<E>(vararg items: E) { //Aqui é criado uma lista, com implementação dos manual de pop, add, peek, entre outros!

    private val elements = items.toMutableList()

    fun push(element : E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop() : E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty() 

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> PilhasOff(vararg elements: E) = (*elements) // Não consigo usa multableStack para criar a pilha por função

fun main() {
  val stack = PilhasOff(0.62,3.14)
}