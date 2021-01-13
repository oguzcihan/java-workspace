import java.util.List;

import javax.persistence.EntityManager;


public class OgrenciView {
	private OgrenciKayit ogrenciKayit = new OgrenciKayit();

	public void kaydet() {
		try {
			
			EntityManager en = EntityUtil.getEntityManager();
			en.getTransaction().begin();
			en.persist(ogrenciKayit.getAdres());
			en.persist(ogrenciKayit);
			en.getTransaction().commit();
			ogrenciKayit = new OgrenciKayit();
	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
		}

		

	}

	public void duzenle() {
		EntityManager en=EntityUtil.getEntityManager();
    	en.getTransaction().begin();
    	en.merge(ogrenciKayit);
    	en.merge(ogrenciKayit.getAdres());
    	en.getTransaction().commit();
    	ogrenciKayit = new OgrenciKayit();
	}

	public void sil() {
		EntityManager en=EntityUtil.getEntityManager();
    	en.getTransaction().begin();
    	en.remove(ogrenciKayit.getAdres());
    	en.remove(ogrenciKayit);
    	en.getTransaction().commit();
    	ogrenciKayit = new OgrenciKayit();
	}

	public String kayitaGit() {
		ogrenciKayit=new OgrenciKayit();
		return "ogrenciKayit";
	}
	public String anasayfa() {
		return "index";
	}
	@SuppressWarnings("unchecked")
	public List<OgrenciKayit> getKayitListesi(){
    	EntityManager en=EntityUtil.getEntityManager();
    	return en.createQuery("from OgrenciKayit").getResultList();	    	
    }
	public OgrenciKayit getOgrenciKayit() {
		return ogrenciKayit;
	}

	public void setOgrenciKayit(OgrenciKayit ogrenciKayit) {
		this.ogrenciKayit = ogrenciKayit;
	}

}
