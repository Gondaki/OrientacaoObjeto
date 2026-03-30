fun main() {

    //variáveis que serão usadas para chamar funcoes
    val Produtos = mutableListOf<String>()
    val Preços = mutableListOf<Double>()

    var Opcoes = 0 // toda variavel precisa de um valor, colocamos "0" e usamos var(mutavel) para
                    // que a variável receba a entrada do usuário (1..5);
    while (Opcoes != 5) { // while estrutura de looping, (!) significa diferente de : ( 1 a 5 )

        println("MERCADINHO DO JOAO")
        println("1-Adicionar Itens")
        println("2-Remover um item")
        println("3-Alterar preço")
        println("4-Listar Produtos")
        println("5-Sair")

       Opcoes = readln()!!.toInt() // variável Opcoes = readln(leitura da entrada do usuario)+toInt(transforma em um valor inteiro)
          if (Opcoes == 1) {
              println("Digite o nome do produto")
              val nome = readln()!!
              println("Digite o valor do produto")
              val valor = readln()!!.toDouble()
              Produtos.add(nome)
              Preços.add(valor)
              println("Produto adicionado")
          }
        if (Opcoes == 2) {
            println("Digite o nome do produto para remover")
            val nome = readln()!!
            val index = Produtos.indexOf(nome)
           if (index != -1){
            Produtos.removeAt(index)
            Preços.removeAt(index)
            println("Produto removido")
        }

        if (Opcoes == 3){
            println("Digite o produto para que deseja alterar o preço")
            val nome = readln()!!
            val index = Produtos.indexOf(nome)
            if (index != -1){

                println("Digite o novo preço do produto")
            val novoPreco = readln()!!.toDouble()
            Preços[index] = novoPreco
                println("Preço alterado com sucesso") }
            if (Opcoes == 4){
                println("LISTA DE PRODUTOS ATUALIZADOS")
                for (i in Produtos.indices){
                    println("${Produtos[i]} - R$ ${Preços[i]}")
                }
            }
            }
        }
    }
}