import java.time.LocalDate
import java.util.Scanner

//classe paciente
//programador: Lucas
//Data: 04/02/2025


fun main() {


    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()

    print("Nome do paciente:")
    paciente1.nome = leitor.nextLine()
    print("Peso do paciente: ")
    paciente1.peso = leitor.nextInt()
    print("Altura do paciente: ")
    paciente1.altura = leitor.nextFloat()
    paciente1.telefone = "(11)92892-8289"
    paciente1.dataNascimento = LocalDate.of(2003, 8, 13)
    paciente1.mostrarDados()

    paciente2.nome = "É d é d"
    paciente2.peso = 71
    paciente2.altura = 1.70f
    paciente2.telefone = "(11)91342-3204"
    paciente2.dataNascimento = LocalDate.of(2008, 5, 15)
    paciente2.mostrarDados()

}