import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Lütfen 1 . sayıyı giriniz");
	float x = Float.parseFloat(scanner.nextLine());
	System.out.println("Lütfen 2 . sayıyı giriniz.");
	
	float y = Float.parseFloat(scanner.nextLine());
	
	System.out.println("İşlem giriniz:");
	char islem = scanner.nextLine().charAt(0);
	switch (islem) {
	case '+': 
		System.out.println("Sonuc :  "  + (x+y));
		break;
	case '-' : 
		System.out.println("Sonuç : "  + (x-y));
	break;
	case '/': 
		System.out.println("Sonuç : " + (x/y) );
		break;
	case '*' :
		System.out.println("Sonuç : "  + (x*y));
		break;
	default: System.out.println("Girdiğiniz iişlem yapılamamaktadır");
		break;
	}
}
}
