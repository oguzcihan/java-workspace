import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class yazar implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	
	@ManyToMany(mappedBy="yazar")
	private List<KitapKayit> kitapkayit = new ArrayList<KitapKayit>();
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<KitapKayit> getKitapkayit() {
		return kitapkayit;
	}
	public void setKitapkayit(List<KitapKayit> kitapkayit) {
		this.kitapkayit = kitapkayit;
	}
}
