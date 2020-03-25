import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, exame;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		if(((nota1 >= 0)&&(nota1 <= 10))&&((nota2 >= 0)&&(nota2 <= 10))&&((nota3 >= 0)&&(nota3 <= 10))) {
			
			media = (nota1 + nota2 + nota3)/3.0;
			
			System.out.printf("MEDIA = %.1f%n", media);
			
			if(media < 4.0) {
				System.out.printf("Reprovado %n");
			}else if((media >= 4.0)&&(media < 7.0)) {
				System.out.printf("Exame %n");
				exame = 7.0 - media;
				System.out.printf("Faltaram %.1f pontos %n", exame);
			}else if(media >= 7.0) {
				System.out.printf("Aprovado %n");
			}
			
		}
		
		sc.close();
	}
}	
