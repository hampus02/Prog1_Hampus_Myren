import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("skriv namn: ");

		String namn = input.nextLine();

		System.out.println("Hej " + namn);
		
		System.out.println("Skriv �lder: ");
		int �lder=input.nextInt();
		
		System.out.println("Skriv l�ngd:");
		double l�ngd = input.nextDouble();
				
		System.out.println(namn+" �r "+�lder+" �r gammal och "+l�ngd+" cm l�ng");
		System.out.println("St�mmer det?");
		
		System.out.println();

	}

}
