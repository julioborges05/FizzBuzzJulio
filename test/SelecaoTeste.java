/*
 * Teste unitario para verificar se a classe de seleção está funcionando
 * Autor: Júlio do Nascimento Borges
*/

import fivevalidation.selecao;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SelecaoTeste{
    
    public SelecaoTeste() {
    }
    
    selecao teste;
    
    @Before
    public void setUp() {
        teste = new selecao();
        for (int i = 0; i < 1000; i++){
            teste.quant[i] = i+1;
        }
    }

    @Test
    public void testePrincipal(){
        int contador3 = 0;
        int contador5 = 0;
        
        for (int i = 0; i < 1000; i++){ //Loop para verificar quantidade de multiplos de 3 e de 5
            if(teste.quant[i] %3 == 0){
                contador3++;
            }
            if(teste.quant[i] % 5 == 0){
                contador5++;
            }
        }
        
        teste.fizzBuzz();
        
        assertEquals(contador3, teste.mult3+teste.mult15);
        assertEquals(contador5, teste.mult5+teste.mult15);
    }
}
