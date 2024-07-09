
public class WorkSpace_İlişkisel_Operatörler {
	public static void main(String[] args) {
		
		
		
        // Relational Operators 
		
		// == eşittir anlamına gelir eşitliği ifade eder.
		// != eşit değildir anlamına gelir , eşitsizliği ifade eder.
		// > büyüktür anlamına gelir , solda ki değerin sağda ki değerden büyük olduğunu ifade eder	
		// < küçüktür anlamına gelir , solda ki değerin sağda ki değerden küçük olduğunu ifade eder	
		// >= büyük veya eşittir anlamına gelir.	
		// <= küçük veya eşittir anlamına gelir.	
		
		// == eşittir
		
		int x = 10;
		int y = 5;
		boolean sonuc_xy = x==y; // İlikisel operatörlerde true veya false değer çıkar sonuç
		System.out.println(sonuc_xy);
		
		// != eşit değildir !
		
		int g = 13;
		int h = 11;
		boolean sonuc_gh = g!=h;
		System.out.println(sonuc_gh);
		
		// > büyüktür 
		
		int e = 15;
		int r = 11; 
		boolean sonuc_er = e>r;
		System.out.println(sonuc_er);
		
		// < küçüktür 
		
		int s = 58;
		int u = 34;
		boolean sonuc_su = s<u ; 
		System.out.println(sonuc_su);
		
		// >= büyük veya eşittir
		int j = 11;
		int k = 11;
   		boolean sonuc_jk = j>=k ;
   		System.out.println(sonuc_jk);
   		
   		// <= küçük veya eşittir
   		
   		int c = 19 ; 
   		int v = 18 ;
   		boolean sonuc_cv = c<=v ; 
   		System.out.println("Sonuç : " + sonuc_cv);
	     
   		
		
		
		
	}
}
