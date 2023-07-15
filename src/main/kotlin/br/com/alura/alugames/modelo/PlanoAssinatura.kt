package br.com.alura.alugames.modelo

class PlanoAssinatura(
    tipo: String,
    val mesalidade: Double,
    val jogosIncluidos: Int): Plano(tipo) {

    override fun obterValor(aluguel: Aluguel): Double {
        val totalJogosNoMes = aluguel.gamer.jogosDoMes(aluguel.periodo.dataInicial.monthValue).size+1

        return if (totalJogosNoMes <= jogosIncluidos) {
            0.0
        } else {
            super.obterValor(aluguel)
        }

    }
}
