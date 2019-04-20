package ornek;
import org.junit.*;
import org.junit.Assert.*;

public class hesaptest {

	
	@Test
	public void testTopla() {
		hesap h = new hesap();
		int sonuc = h.faktoriyel(10);
		Assert.assertEquals(3628800,sonuc);
		
	}
	@Test
	public void deneme() {
		hesap h=new hesap();
		int sonuc =h.toplam(2,2);
		Assert.assertEquals(4,sonuc);
	}
}
