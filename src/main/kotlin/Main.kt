import dataclass.Conteudo
import dataclass.Formacao
import dataclass.Usuario
import enumclass.Level

fun main() {
    val usuario1 = Usuario("Pedro")
    val usuario2 = Usuario("Ana")
    val usuario3 = Usuario("Marcos")
    val usuario4 = Usuario("Julia")

    val conteudo1 = Conteudo("Aprendendo Kotlin",1, Level.BASICO)
    val conteudo2 = Conteudo("Desafio Kotlin",2, Level.BASICO)
    val conteudo3 = Conteudo("Programação Orientada e Objeto", 3, Level.INTERMEDIARIO)
    val conteudo4 = Conteudo("SpringBoot - API Rest", 10, Level.AVANCADO)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)


    val formacaoJava = Formacao("Formação Java", listOf(conteudo3, conteudo4))
    formacaoJava.matricular(usuario3)
    formacaoJava.matricular(usuario4)


    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    println("Formação Kotlin")
    for (conteudo in formacaoKotlin.conteudos){
        println("Conteudo: ${conteudo.nome}  Duração:  ${conteudo.duracao} horas  Level: ${conteudo.nivel}")
    }

    println( "Inscrições")
    for (usuario in formacaoKotlin.getUsuariosInscritos()){
        println("Nome: ${usuario.nome}")
    }

    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    println("Formação Java")
    for (conteudo in formacaoJava.conteudos){
        println("Conteudo: ${conteudo.nome}  Duração:  ${conteudo.duracao} horas  Level: ${conteudo.nivel}")
    }

    println( "Inscrições")
    for (usuario in formacaoJava.getUsuariosInscritos()){
        println("Nome: ${usuario.nome}")
    }
}