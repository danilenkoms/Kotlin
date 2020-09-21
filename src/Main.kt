//Массивы:
fun main(args: Array<String>){
    println("Массивы:")
    var items: Array<Int> = arrayOf(5, 12, 7, 4, 0, 1)
    var itemsl = mutableListOf<Any>(5, 12, 7, 4, 0, 1)
    println(items.set(0, 45))
    println(items[0])
    println(items.get(1))
    println(items.size)
    for(el in items) {
        println(el)
    }
    items.forEach {el ->
        println(el)
    }
    items.forEachIndexed {index, el ->
        println("$el с индексом $index")
    }
    itemsl.add("Dogs")

    //Список
    var items_list = listOf<Int>(5, 12, 7, 4, 0, 1)
    .lastIndexOf(7) //аходит эемент 7 из списка, поиск с конца выполняется
    var user: Map<String, String> = mapOf("name" to "Bob", "age" to "1")
    var userAny: Map<String, Any> = mapOf("name" to "Bob", "age" to 1, "isHasCar" to true)
    var userAny2 = mapOf("name" to "Bob", "age" to 1, "isHasCar" to true)

    user.forEach {key, value -> println("$key -> $value")}

    //

}

fun printSome(item: String, vararg word: Any){
    print("$item: ")
    word.forEach { el-> println("$el") }
    println("")
}
fun vivod(ards: Array<String>){
    var names = arrayOf("bob",  "John", "Alex", 1, true)
    printSome("Some")
    printSome("Some", "hello")
    printSome("Some", "hello", "some new")
    printSome("Hi", *names)
}