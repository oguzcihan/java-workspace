import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class KitapKayit {
	@Id
	@GeneratedValue
	private Long kitapId;

	private String kitapAdi;
	
	@OneToOne
	private yazar yazar=new yazar();
	
	

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public yazar getYazar() {
		return yazar;
	}

	public void setYazar(yazar yazar) {
		this.yazar = yazar;
	}


	public Long getKitapId() {
		return kitapId;
	}

	public void setKitapId(Long kitapId) {
		this.kitapId = kitapId;
	}



	
	
}
