fun main() {

}

// string methods / arrayof
// fun main() {
//
//    val str = "lorem ipsum"
//
//    println(str.capitalize())
//    println(str.decapitalize())
//    println(str.contains("blah"))
//    println(str.startsWith("1"))
//    println(str.startsWith("L"))
//    println(str.endsWith("m"))
//    println(str.endsWith("M"))
//
//    println(str)
//    println(arrayOf(1, 2, 3, 4, 5).asList())
//}

// using param vararg
//fun <T> media(vararg valores: T) {
//    for (valor in valores) {
//        println(valor)
//    }
//}
//
//fun main() {
//
//    media(1, 4f, "", false, "", 'C')
//}


// flow for //
// fun main() {
//
//    val str = "Alexandre Trapp"
//
//    for (c in str)
//        print("$c ")
//
//    for (i in 0..100 step 5)
//        print("$i ")
//
//    for (j in 100 downTo 0)
//        print("$j ")
//}

// when flow //
//fun operacao (a: Int, b: Int, opcao: String): Int {
//
//    when {
//        a > 0 && b > 0 -> println("Variáveis maiores que zero")
//    }
//
//    when {
//        a in 1..99 -> println("Século!!")
//    }
//
//    when (opcao) {
//        "Soma" -> return a + b
//        "Subtração" -> return  a - b
//
//        else -> {
//            println("Operação incorreta")
//            return 0
//        }
//    }
//}
// fun main() {
//  operacao(10, 10, "Soma")
//  operacao(10, 10, "Subtração")
//}
//
//   elvis operator
//   val test: Int? = 24
//
//    val op: Int = test ?: 100
//    println(op)