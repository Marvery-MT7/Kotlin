fun main() {

    println("Exemplo 1: ")
    println("")

    var customers = 10

        //Alguns clientes saem da fila
        customers = 8   

        customers = customers + 3 // exemplo de adição: 11
        customers += 7            // exemplo de adição : 18
        customers -= 3            // exemplo de subtração : 15  
        customers *= 2            // exemplo de multiplicação : 30  
        customers /= 3            // exemplo de divisão : 10  

        println(customers)   //10

        println("Exemplo 2: ")
        println("")

        //Variável declarada sem inicialização
        val d : Int
        //Variável inicializada
        d = 3

        // Variável explicitamente digitada e inicializada 
        val e : String = "olá"

        // Variáveis podem ser lidas porque foram inicializadas
        println(d)       //3
        println(e)       //olá
}