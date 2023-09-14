package ativi3;

import java.util.Scanner;

public class ativiviQ3 {

	void quest(){
		Scanner doo = new Scanner(System.in);
			System.out.println("=====================================================");
			System.out.println("escreva o seu salario para sofre o reajuste           ");
			System.out.println("=====================================================");
			double salario = doo.nextDouble();
			
			double desconto = 0;
			if (salario <= 280) {
				 desconto = (salario*0.20);
				System.out.println("=====================================================");
				System.out.println("O percentual de aumento aplicado %20");
			}
			else if (salario>280 && salario <700 ) {
				 desconto = (salario*0.15);
				System.out.println("=====================================================");	
				System.out.println("O percentual de aumento aplicado %15");
				
			}
			else if (salario>700 && salario <1500 ) {
				 desconto = (salario*0.10);
				System.out.println("=====================================================");	
				System.out.println("O percentual de aumento aplicado %10");
				
			}
			else if (salario>1500 ) {
				 desconto = (salario*0.05);
				System.out.println("=====================================================");	
				System.out.println("O percentual de aumento aplicado %5");
				
						
				
				
				
				doo.close();
			}
			
			System.out.println("=====================================================");	
			System.out.println("O salário antes do reajuste " + salario);
			System.out.println("=====================================================");	
			System.out.println("O valor do aumento " + desconto );
			System.out.println("=====================================================");
			System.out.println("O novo salário, após o aumento " + (desconto + salario) );
			System.out.println("=====================================================");
			
		}
	}

