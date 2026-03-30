fun main() {

    val produtos = mutableListOf<String>()
    val precos = mutableListOf<Double>()

    var opcao: Int

    do {
        println("\nMERCADINHO DO JOAO")
        println("1 - Adicionar item")
        println("2 - Remover item")
        println("3 - Alterar preço")
        println("4 - Listar produtos")
        println("5 - Sair")

        opcao = readln().toInt()

        when (opcao) {
            1 -> adicionarProduto(produtos, precos)
            2 -> removerProduto(produtos, precos)
            3 -> alterarPreco(produtos, precos)
            4 -> listarProdutos(produtos, precos)
            5 -> println("Saindo...")
            else -> println("Opção inválida!")
        }

    } while (opcao != 5)
}

fun adicionarProduto(produtos: MutableList<String>, precos: MutableList<Double>) {
    println("Digite o nome do produto:")
    val nome = readln()

    println("Digite o preço:")
    val preco = readln().toDouble()

    produtos.add(nome)
    precos.add(preco)

    println("Produto adicionado com sucesso!")
}

fun removerProduto(produtos: MutableList<String>, precos: MutableList<Double>) {
    println("Digite o nome do produto para remover:")
    val nome = readln()

    val index = produtos.indexOf(nome)

    if (index != -1) {
        produtos.removeAt(index)
        precos.removeAt(index)
        println("Produto removido!")
    } else {
        println("Produto não encontrado.")
    }
}

fun alterarPreco(produtos: MutableList<String>, precos: MutableList<Double>) {
    println("Digite o nome do produto:")
    val nome = readln()

    val index = produtos.indexOf(nome)

    if (index != -1) {
        println("Digite o novo preço:")
        val novoPreco = readln().toDouble()
        precos[index] = novoPreco
        println("Preço atualizado!")
    } else {
        println("Produto não encontrado.")
    }
}

fun listarProdutos(produtos: MutableList<String>, precos: MutableList<Double>) {
    println("\nLISTA DE PRODUTOS:")
    println("Quantidade de produtos: ${produtos.size}")

    for (i in produtos.indices) {
        println("${produtos[i]} - R$ ${precos[i]}")
    }
}


