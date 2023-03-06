package fibonacciapp;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    private List<Integer> fibonacci = new ArrayList<Integer>();
    
    public void fibonacci(int controle){
        int antecedente = 0;
        int consequente = 1;
        fibonacci.add(antecedente);
        fibonacci.add(consequente);
        int soma;
        int contagem = 0;
        
        while(contagem < controle){
            soma = antecedente + consequente;
            fibonacci.add(soma);
            antecedente = consequente;
            consequente = soma;
            contagem++;
        }
    
    }
    
    public void mostraFibonacci(){
        for(int numero : this.fibonacci){
            System.out.println(numero);
            
        }
     
    }
    public void verificaNumero(int verificar){
        int controla = 0;
        for(int numero : this.fibonacci){
            
            if(numero == verificar){
                
                controla++;
            }
            
            
        }
        if(controla == 1){
            System.out.println("O numero "+verificar+ " pertence à sequência de fibonacci.");
        }
        
        else{
                System.out.println("O numero "+verificar+ " não pertence à sequência de fibonacci.");
        }
    }
        
}
