
public class Login {
	private String kullaniciAdi;
	private String sifre;
	
	public String giris() {
		if(kullaniciAdi.equals("Admin")&&sifre.equals("1234")) {
			return "dogru";
		}
		else {
			return "yanlis";
		}
	}

	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
}
