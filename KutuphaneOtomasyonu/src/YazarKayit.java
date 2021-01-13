import java.util.List;

import javax.persistence.EntityManager;


public class YazarKayit {
	private yazar yazarr = new yazar();

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		
		en.persist(getYazarr());
		en.getTransaction().commit();
		setYazarr(new yazar());

	}

	
	@SuppressWarnings("unchecked")
	public List<KitapKayit> getKayitListesi(){
    	EntityManager en=EntityUtil.getEntityManager();
    	return en.createQuery("from yazar").getResultList();	    	
    }


	public yazar getYazarr() {
		return yazarr;
	}


	public void setYazarr(yazar yazarr) {
		this.yazarr = yazarr;
	}

}
