import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaMensal, precoCarro, parcelas, entrada;
		
		rendaMensal = sc.nextDouble();
		precoCarro = sc.nextDouble();
		
		if(rendaMensal <= 1000.00) {
			entrada = precoCarro * 0.60;
			parcelas = (precoCarro - entrada)/12;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", parcelas);
		}else if((rendaMensal > 1000.00) && (rendaMensal <= 2000.00)) {
			entrada = precoCarro * 0.40;
			parcelas = (precoCarro - entrada)/24;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", parcelas);
		}else if((rendaMensal > 2000.00) && (rendaMensal <= 5000.00)) {
			entrada = precoCarro * 0.20;
			parcelas = (precoCarro - entrada)/36;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", parcelas);
		}else if(rendaMensal > 5000.00) {
			entrada = precoCarro * 0.10;
			parcelas = (precoCarro - entrada)/48;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", parcelas);
		}
		
		
		sc.close();
	}
}	
