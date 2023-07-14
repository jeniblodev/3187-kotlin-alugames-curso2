package br.com.alura.alugames.modelo

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo) {
    override fun toString(): String {
        return "Aluguel do jogo ${jogo.titulo} por ${gamer.nome}"
    }
}
