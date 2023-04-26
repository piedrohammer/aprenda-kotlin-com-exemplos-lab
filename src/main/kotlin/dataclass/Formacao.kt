package dataclass

data class Formacao(val nome: String, var conteudos: List<Conteudo>) {

    val inscricao = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscricao.add(usuario)
    }

    fun getUsuariosInscritos():List<Usuario>{
        return inscricao
    }

}