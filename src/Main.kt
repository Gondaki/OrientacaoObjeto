fun main() {

    val ferrari = Carro(100.0, 0.0, 2, 5, 900, 80)
    val mustang = Carro(120.0, 50.0, 7, 7, 950, 100)
    val porsche = Carro(90.0, 10.0, 2, 3, 750, 50)

    val habilidade1 = Habilidade("Turbo", 20)
    val habilidade2 = Habilidade("Controle", 15)
    val habilidade3 = Habilidade("Nitro", 25)

    val piloto1 = Piloto("Joao", 18, habilidade1)
    val piloto2 = Piloto("Carlos", 25, habilidade2)
    val piloto3 = Piloto("Ana", 22, habilidade3)

    val carros = listOf(ferrari, mustang, porsche)
    val pilotos = listOf(piloto1, piloto2, piloto3)

    val corrida = Pista(carros, pilotos, voltas = 10, clima = "Ensolarado")

    corrida.iniciarCorrida()
}
