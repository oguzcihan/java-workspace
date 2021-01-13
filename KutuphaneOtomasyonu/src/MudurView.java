import java.util.List;

import javax.persistence.EntityManager;

public class MudurView {

	private Mudur mudur=new Mudur();

	public void kaydet() {
		try {
			
			EntityManager en = EntityUtil.getEntityManager();
			en.getTransaction().begin();
			GenelMudur genelmudur = new GenelMudur();
			genelmudur.setMudurAd("Deneme");
			genelmudur.setMudurSoyad("Deneme");
			genelmudur.setBolge("DENEME");
			genelmudur.setMudur("Genel");
			
			en.persist(genelmudur);
			en.getTransaction().commit();
	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
		}

		

	}
	public List<Mudur> getMudurliste(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("from Mudur").getResultList();
	}
	public String mudureGit() {
		return "mudurGosterim";
	}

	public Mudur getMudur() {
		return mudur;
	}

	public void setMudur(Mudur mudur) {
		this.mudur = mudur;
	}
	

	
	
}
