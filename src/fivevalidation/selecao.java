/*
 * Classe para seleção de numeros multiplos de 3 e 5
 * Autor: Júlio do Nascimento Borges
*/

package fivevalidation;

public class selecao {
    public int[] quant = new int[1000]; //vetor com as 1000 casas
    public int mult3 = 0; //multiplos de 3
    public int mult5 = 0; //multiplos de 5
    public int mult15 = 0; //multiplos de 15
    
    public void fizzBuzz(){
        for (int j = 0; j < 1000; j++){
            if(quant[j]%15 == 0){
                System.out.println("FizzBuzz");
                mult15++;
            }else if(quant[j] % 3 == 0){
                System.out.println("Fizz");
                mult3++;
            }else if(quant[j] % 5 == 0){
                System.out.println("Buzz");
                mult5++;
            }else{
                System.out.println(quant[j]);
            }
        }
        System.out.println("===============Resumo===============");
        System.out.println(mult3 + " - Fizz\n" + mult5 + " - Buzz\n" + mult15 + " - FizzBuzz");
    }
}
