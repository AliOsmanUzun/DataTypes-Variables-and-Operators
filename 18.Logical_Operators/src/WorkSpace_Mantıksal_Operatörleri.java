
public class WorkSpace_Mantıksal_Operatörleri {
	public static void main(String[] args) {

		/*
		 * && ve || veya ! değil ?: üçlü operatör
		 */

		// ! değil operatörü sonucun zıttını almak için kullanılır.

		boolean x = !false;
		// normal şartta false gelecekti ama değil operatörü kullandığım için
		// sonucun tam zıttı gelecek ve true değer alacak değişken
		System.out.println(x);

		int a = 15;
		int b = 5;

		boolean sonuc = !(a > b); // normalde bu karşılaştırmada true değer gelmesi lazım
									// ama ! değildir operatörü olduğu için zıttı alınacak
		System.out.println(sonuc);

		// && ve --> operatörü
		// && operatöründe tüm koşulların sağlanması gerekir.
		// Eğer sağlanmaz ise false değer döndürür.

		boolean ve = a > b && a >= b; // true değer döndürdü çünkü 2 koşulda sağlanıyor
		System.out.println(ve);

		boolean ve_olumsuz = a < b && a >= b;// false değer aldım ilk koşul sağlanmadı
		System.out.println(ve_olumsuz);

		// || veya operatörü ( or ) 
		// veya operatöründe koşullardan en az bir tanesinin gerçekleşmesi yeterlidir.
		// hepside gerçekleşebilir.
		boolean veya = a == b || a > b; // en az biri sağlandı true değer döner
		System.out.println(veya);

		// ?: üçlü operatör - ternary operator
		// ? işareti koşula soru soruyor koşul sağlanıyor mu eğer sağlanıyorsa
		// soru işaretinden sonra atanmasını istediğim değer değişkene atanıyor.
		// : ise koşul sağlanmıyorsa demek
		// :' dan sonra koşul sağlanmadığı takdirde atanacak değer yer alıyor.

		boolean uclu_operator = a > b ? true : false;
		// manası şu a'b den büyük mü büyükse true değilse false ata
		System.out.println("Üçlü Operatör Sonucu ; " + uclu_operator);

		String uclu_operator1 = a == b ? "a b'ye eşit " : "a b'ye eşit değil";
		// a b'ye eşit mi eşitse "a b'ye eşit " ifadesini ata
		// eğer değilse "a b'ye eşit değil" ifadesini değişkenime ata
		System.out.println(uclu_operator1);
		
		
	}

}
