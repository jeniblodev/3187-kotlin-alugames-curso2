package br.com.alura.alugames.modelo

class PlanoAssinatura(
    tipo: String,
    val mesalidade: Double,
    val jogosIncluidos: Int): Plano(tipo) {

    override fun obterValor(aluguel: Aluguel): Double {

    }
