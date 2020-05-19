/*
 * Código para verificação de números multiplos de 3 e 5
 * Autor: Júlio do Nascimento Borges
*/

package fivevalidation;

public class FiveValidation {

    public static void main(String[] args) {
        selecao escolha = new selecao(); //Intância do objeto
        
        for (int i = 0; i < 1000; i++){ //Loop para salvar as variaveis de 1 a 1000
            escolha.quant[i] = i+1;
        }
        
        escolha.fizzBuzz();
    }
}