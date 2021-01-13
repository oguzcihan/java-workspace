import java.util.List;
@SuppressWarnings("unused")
public class Arama {
	 private KitapKayit kitapkayit=new KitapKayit();
	 private String araAd;

	   
	    @SuppressWarnings("unchecked")
	    public List<KitapKayit>getKitapListesi(){

	        javax.persistence.EntityManager en =EntityUtil.getEntityManager();
	        kitapkayit = new KitapKayit();
	        return en.createQuery("select k From KitapKayit k where kitapAdi like :isim")
	        		.setParameter("isim", this.araAd + "%")
	        		.getResultList();
	    }
		public String kitapArama() {
			return "aramaView";
		}
		
		public String iletisim() {
			return "iletisim";
		}
	    
	    public KitapKayit getKitapkayit() {
	        return kitapkayit;
	    }
	    public void setKitapkayit(KitapKayit kitapkayit) {
	        this.kitapkayit = kitapkayit;
	    }
		public String getAraAd() {
			return araAd;
		}
		public void setAraAd(String araAd) {
			this.araAd = araAd;
		}
		

}
