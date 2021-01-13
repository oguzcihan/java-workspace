
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adres implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String il;
	private String ilce;
	
	@OneToOne(mappedBy="adres")
	private OgrenciKayit ogrenci;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public OgrenciKayit getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(OgrenciKayit ogrenci) {
		this.ogrenci = ogrenci;
	}
	
}
