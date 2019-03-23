package wert;

import org.junit.*;

public class hesaptest {

	// @org.junit.Test
	@Test
	public void testTopla() {
		
		Hesap h = new Hesap();
		
		int sonuc = h.topla(345, 453);
		
		Assert.assertEquals(798, sonuc);
		
	}

	@Test
	public void testFaktoriyel() {
		
		Hesap h = new Hesap();
		
		int sonuc = h.faktoriyel(10);
		
		
	}
	@Test
	public void cikarma() {
		Hesap h = new Hesap();
		int sonuc = h.cikar(5,2);
		System.out.println(sonuc);
		Assert.assertEquals(3, sonuc);
	}
	@Test
	public void carpma() {
		Hesap h = new Hesap();
		int sonuc = h.carp(2,5);
		System.out.println(sonuc);
		Assert.assertEquals(10, sonuc);
	}
	@Test
	public void bol() {
		Hesap h = new Hesap();
		double	 sonuc = h.bol(5, 2);
		System.out.println(sonuc);
	}
}
