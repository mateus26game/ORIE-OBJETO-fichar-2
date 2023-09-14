package primeiraQ1;

import java.util.Scanner;

public class primeiraquestao {
	
 public	void questa(){
		Scanner entra = new Scanner(System.in);
			System.out.println("=====================================================");
			System.out.println("escreval o valor da sua hora | ex:R$5");
			System.out.println("=====================================================");
			double valorhora = entra.nextDouble();
			System.out.println("======================================================");
			System.out.println("escreval quantas horas você trbalho nesse més|ex:220");
			System.out.println("======================================================");
			double horatraba = entra.nextDouble();
			
			double salario = valorhora*horatraba;
			
			double irt = 0;
			
			if (salario <= 900  ) {
			 irt = 0; 									
			}
			else if ( salario>900 && salario <1501  ) {
			 irt	= (salario*0.05);	
			}
			else if (salario>1500 && salario<2500) {
			 irt	= (salario*0.10);	
			}
			else if ( salario>2500) {
             irt	= (salario*0.20); 	
			}
           double  inss = (salario*0.10);
           double fgts = (salario*0.11);
           double liquido = (salario-inss-irt);
           double desconto = (irt + inss);
        
            
            System.out.println("==========================================");
            System.out.println("|           folha de pagamento            |");
            System.out.println("==========================================");
            System.out.println("|salário bruto      |:R$|"+salario+"|          |");
            System.out.println("|(-)IR              |:R$|"+irt +"  |          |");
            System.out.println("|(-)INSS(10%)       |:R$|"+ inss+" |          |");
            System.out.println("|FGTS(11%)          |:R$|"+fgts+" |          |");
            System.out.println("|Total de descontos |:R$|"+desconto+" |          |");
            System.out.println("------------------------------------------");
            System.out.println("|Salario Líquido    |:R$|"+liquido+" |          |");
            System.out.println("==========================================");
 
               
			
		entra.close();
		 
	}

}
