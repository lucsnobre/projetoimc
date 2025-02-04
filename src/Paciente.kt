import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Float = 0.0f
    var telefone: String = ""

    fun calcularIMC(): Float{
        var imc = peso / altura.pow(2)
        return imc
    }

    fun mostrarDados(){
        println("DADOS DO PACIENTE")
        println("--------------------------")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("TELEFONE: $telefone")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularIMC()}")
        println("Classificação: ${classificarIMC()}")
        println("--------------------------")
    }

    fun classificarIMC(): String{
        val imc = calcularIMC()
        var classificacao = ""

        if (imc < 18.5) {
            classificacao = "Abaixo do Peso"
        }else if (imc > 18.5&& imc < 25.0){
            classificacao = "Peso ideal"
    }else{
        classificacao = "Acima do Peso"
        }
        return classificacao
    }

    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        return idade
    }


}