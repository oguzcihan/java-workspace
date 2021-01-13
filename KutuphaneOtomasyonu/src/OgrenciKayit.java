import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.validator.Email;
import org.hibernate.validator.Range;
@Entity
@Table(name="OgrKayit")

public class OgrenciKayit implements Serializable{

	@TableGenerator(name="id_al",table="tb_demo",pkColumnName="entity_name",
			valueColumnName="deger",allocationSize=5,pkColumnValue="Kayit")	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="id_al")
	private Long Id;
	private String ad;
	private String soyad;
	@Email
	private String mail;
	@Version
	private Integer versionNum;
	@Range(min=4,max=100,message="Yas 4 ile 100 arasinda olmali")
	private Integer yas;
	
	@Temporal(TemporalType.DATE)
	private Date suankitarih;
	
	@OneToOne
	private Adres adres=new Adres();
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
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
	

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Integer getYas() {
		return yas;
	}
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	public Date getSuankitarih() {
		return suankitarih;
	}
	public void setSuankitarih(Date suankitarih) {
		this.suankitarih = suankitarih;
	}
	public Integer getVersionNum() {
		return versionNum;
	}
	public void setVersionNum(Integer versionNum) {
		this.versionNum = versionNum;
	}
	
	
}
