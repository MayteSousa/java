/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_28_Reajuste_Salarial;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome;               
        
        float salario=0.0f, salarioMinimo, reajuste=0.0f, totalFolha=0.0f, totalReajuste=0.0f, aumentoFolha=0.0f;
        
        System.out.println("Informe o Sal�rio M�nimo");
        salarioMinimo = leitor.nextFloat();
        
        for (int i = 0; i < 584; i++){
            System.out.println("Informe o nome");
            nome = leitor.nextLine();
            
            System.out.println("Informe o Sal�rio");
            salario = leitor.nextFloat();
            
            totalFolha = totalFolha + salario;
            
            if ( salario < ( salarioMinimo * 3)){
                reajuste = (salario * 50) / 100;
            }
            else{
                if ( salario >= ( salarioMinimo * 3) && salario <= ( salarioMinimo * 10)){
                    reajuste = (salario * 20) / 100;
                }else{
                    if ( salario > ( salarioMinimo * 10) && salario <= ( salarioMinimo * 20)){
                        reajuste = (salario * 15) / 100;
                    }
                    else{
                        reajuste = (salario * 10) / 100;
                    }
                }        
            }
            salario = salario + reajuste;
            totalReajuste = totalReajuste + reajuste;
            
            System.out.println("Nome: "+nome);
            System.out.println("Reajuste: "+reajuste);
            System.out.println("Novo sal�rio: "+salario);
        }
        
        aumentoFolha = totalFolha - totalReajuste;
        System.out.println("Aumento na folha de pagamento: "+aumentoFolha);
    }
}