package br.com.mario

fun main() {
    val soma: (Int, Int) -> Int = Soma()
    println(soma(10, 20))

    val funcaoSoma = { a: Int, b: Int ->
        a + b
    }

    println(funcaoSoma(20, 30))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario >= 1000) {
            return@lambda salario + 50
        }
        salario + 100
    }

    println(calculaBonificacao(800.0))
    println(calculaBonificacao(1000.0))
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}