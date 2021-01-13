import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorColumn(name="Ayristir")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Mudur implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String mudurAd;
	private String mudurSoyad;
	private String bolge;
	@Column(insertable = false,updatable = false)
	private String Ayristir;
	
	public String getMudurAd() {
		return mudurAd;
	}
	public void setMudurAd(String mudurAd) {
		this.mudurAd = mudurAd;
	}
	public String getMudurSoyad() {
		return mudurSoyad;
	}
	public void setMudurSoyad(String mudurSoyad) {
		this.mudurSoyad = mudurSoyad;
	}
	public String getBolge() {
		return bolge;
	}
	public void setBolge(String bolge) {
		this.bolge = bolge;
	}
	public String getAyristir() {
		return Ayristir;
	}
	public void setAyristir(String ayristir) {
		Ayristir = ayristir;
	}

}
