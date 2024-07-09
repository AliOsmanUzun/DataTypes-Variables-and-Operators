
public class WorkSpaceÇarpma_Bölme {
	public static void main(String[] args) {

		// Çarpma operatörü : *
		// Bölme operatörü : /
		/*
		 * İşlem önceliği ; 1.Parantezli ifadeler en yüksek önceliğe sahiptir
		 * 2.Çarpma,Bölme ve Mod işlemleri ikinci önceliğe sahiptir. 3.Toplama ve
		 * Çıkarma işlemleri üçüncü önceliğe sahiptir.
		 * 
		 */
		// ÇARPMA İŞARETİ KULLANIMI
		int number1 = 50;
		int number2 = 5;

		int result = number1 * number2;

		System.out.println(result);
		
		// BÖLME İŞARETİ KULLANIMI 
		int sayibolme1 = 25;
		int sayibolme2 = 5;
		int bolmesonuc = sayibolme1/sayibolme2;
		System.out.println(bolmesonuc);
		
		
		
		// ÇARPMA VE BÖLME KULLANIMI
		int sayi1 = 58;
		int sayi2 = 4;
		int sayi3 = 2;

		int sayisonuc = sayi1 * sayi3 / sayi2; // burada öncelik eşit olduğu için işlem soldan sağa yapılacak
		System.out.println(sayisonuc);

		// parantez kullanımı
		
		int saayi1 = 120;
		int saayi2 = 5; 
		int saayi3 = 2 ;
		
		int saayisonuc = (saayi1/saayi2)*saayi3 ;
		System.out.println("Sonuç : " + saayisonuc);
		
		// parantezin anlamı şu ilk önce bu işlemi yap
		
		
		
		

	}
}
