/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo Kotlin do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Menu(when)
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

fun main() {

   print(" **** Seja bem ao estoque da Generation *****")
    var num:Int
    do {



            println("O que voce gostaria de fazer? ")
            println("\nDigite: 0 - Sair" +
                    "\nDigite: 1 - Adicionar produto" +
                    "\nDigite: 2 - Atualizar produto" +
                    "\nDigite: 3 - Deletar produto" +
                    "\nDigite: 4 - Listar produtos")

        print("\nDigite aqui: ")
        num = readln().toInt()


           when (num) {
               0 -> {
                   println("Programa finalizado com sucesso")
               }
               1 -> {
                   println("O que voce gostaria de adicionar no estoque? ")
                   val prod = readln()
                   println(adicionar(prod))
               }
               2 -> {
                   println("O que voce gostaria de atualizar no estoque? ")
                   println("${listar(estoque)}")
                   val prod = readln()
                   println(atualizar(prod))
               }
               3 -> {
                   println("O que voce gostaria de deletar no estoque? ")
                   val prod = readln()
                   println(deletar(prod))
               }
               4 -> {
                   println("${listar(estoque)}")

               }
           }
       }while ((num!=0) && (num in 1..4))




}
//Variavel global, onde sera relizado nas funções e ma main
val estoque = mutableListOf<String>()

//Função para armazenar os valores na lista
fun adicionar(produto: String){
        if (produto != "") {
            estoque.add(produto)
        } else {
            println("Produto inválido")
        }
    return print("O  produto:$produto foi cadastrado no estoque com sucesso\n")
}



//Função remover os itens da lista
fun deletar(produto: String){
        if(estoque.contains(produto)){
            estoque.remove(produto)
            print("O dado $produto foi removido da lista com sucesso")

        }else{
            println("O nome $produto não existe na lista")
        }
}


//Função para atualizar/editar os itens
fun atualizar(produto: String){

    if(estoque.contains(produto)){
        val index = estoque.indexOf(produto)
        println("Digite o novo nome: ")
        val valor = readln()
        estoque[index] = valor
        println("O produto foi atualizado com sucesso!")
    }else{
        println("O $produto não existe na lista")
    }
}
//Função para listar os itens
fun listar(estoque: MutableList<String>) {
    estoque.forEach{
        println("Produto: $it")
    }
}