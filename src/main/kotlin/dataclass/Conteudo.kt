package dataclass

import enumclass.Level

data class Conteudo(var nome: String, val duracao: Int = 60, val nivel: Level)