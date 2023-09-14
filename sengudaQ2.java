package segunda;

import java.util.Scanner;

public class sengudaQ2 {
	

	
	public void questae(){
		
		
		Scanner dooo = new Scanner(System.in); {
			System.out.println("=====================================================");
			System.out.println("escreva o lado 1 do triângulo          ");
			System.out.println("=====================================================");
			double lado1 = dooo.nextDouble();
			System.out.println("======================================================");
			System.out.println("escreva o lado 2 do triângulo");
			System.out.println("======================================================");
			double lado2 = dooo.nextDouble();
			System.out.println("======================================================");
			System.out.println("escreva o lado 2 do triângulo");
			System.out.println("======================================================");
			double lado3 = dooo.nextDouble();
			
			if (lado1 == lado2 && lado2 == lado3 ) {
				System.out.println("======================================================");
				System.out.println("triângulo equilatero");
				System.out.println("======================================================");
				
			}else if (lado1 != lado2 && lado2 != lado1 && lado3!=lado1) {
				System.out.println("======================================================");
				System.out.println("triângulo escaleno");
				System.out.println("======================================================");
			}
			else if ((lado1==lado2)&& (lado2!=lado3)||(lado1!=lado2)&& (lado2==lado3)|| (lado1==lado3)&&  (lado2!=lado3)) {
				System.out.println("======================================================");
				System.out.println("triângulo isosceles");
				System.out.println("======================================================");
			
			
			
				
			
				dooo.close();
				}

		}
		}
	}
	

