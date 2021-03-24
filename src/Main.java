import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2,n3,media;
		
		System.out.println("Digite a primeira nota");
		n1=teclado.nextInt();
		System.out.println("Digite a segunda nota");
		n2=teclado.nextInt();
		System.out.println("Digite a terceira nota");
		n3=teclado.nextInt();
		media=(n1+n2+n3)/3;
		
		if((media>=0)&&(media<3)){
			System.out.println("REPROVADO");
			
		}else if ((media>=3)&&(media<7)) {
			System.out.println("EXAME");
		}
		else if((media>=7)&& (media <=10))  {
		System.out.println("APROVADO");
		}
		
		
		
		teclado.close();

	}

}
