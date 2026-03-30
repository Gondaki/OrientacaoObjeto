class Pista(
    val carros: List<Carro>,
    val pilotos: List<Piloto>,
    val voltas: Int,
    val clima: String
) {

    fun iniciarCorrida() {
        println("\n INICIANDO CORRIDA ")

        val resultados = mutableListOf<Pair<Piloto, Double>>()

        for (i in carros.indices) {
            val carro = carros[i]
            val piloto = pilotos[i]

            // cálculo simples de desempenho
            val desempenho =
                carro.velocidade +
                        carro.aceleracao +
                        carro.freio +
                        carro.resistencia +
                        piloto.habilidade.bonus

            resultados.add(Pair(piloto, desempenho))
        }

        // ordena do maior desempenho para o menor
        val ranking = resultados.sortedByDescending { it.second }

        println("\n PLACAR FINAL ")

        for ((posicao, resultado) in ranking.withIndex()) {
            println("${posicao + 1}º lugar: ${resultado.first.nome} - Pontuação: ${resultado.second}")
        }
    }
}
