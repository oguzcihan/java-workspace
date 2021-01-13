import java.util.List;

import javax.persistence.EntityManager;


public class KitapView {

	private KitapKayit kitapKayit = new KitapKayit();

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		
		en.persist(kitapKayit.getYazar());
		en.persist(kitapKayit);
		en.getTransaction().commit();
		kitapKayit = new KitapKayit();

	}
	public void duzenle() {
		EntityManager en=EntityUtil.getEntityManager();
    	en.getTransaction().begin();
    	en.merge(kitapKayit);
    	en.merge(kitapKayit.getYazar());
    	en.getTransaction().commit();
    	kitapKayit = new KitapKayit();
	}

	public void sil() {
		EntityManager en=EntityUtil.getEntityManager();
    	en.getTransaction().begin();	
    	en.remove(kitapKayit.getYazar());
    	en.remove(kitapKayit);
    	en.getTransaction().commit();
    	kitapKayit = new KitapKayit();
	}
	public String kayitaGit() {
		kitapKayit=new KitapKayit();
		return "KitapKayit";
	}
	public String anasayfa() {
		return "index";
	}
	

	@SuppressWarnings("unchecked")
	public List<KitapKayit> getKayitListesi(){
    	EntityManager en=EntityUtil.getEntityManager();
    	return en.createQuery("from KitapKayit").getResultList();	    	
    }


	public KitapKayit getKitapKayit() {
		return kitapKayit;
	}


	public void setKitapKayit(KitapKayit kitapKayit) {
		this.kitapKayit = kitapKayit;
	}
	
}
