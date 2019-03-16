package ornek;

public class hesap {
	public int toplam(
	int sayi1,
	int sayi2) {
		return sayi1+sayi2;
	}
	public int faktoriyel(int sayi) {
		int sonuc=0;
		for (int i =1;i<=sayi;i++) {
			sonuc+=i;
		}
		return sonuc;
		
	}

}