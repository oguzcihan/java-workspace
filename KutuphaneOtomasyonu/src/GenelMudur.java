import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("12")
public class GenelMudur extends Mudur{
private String mudur;

public String getMudur() {
	return mudur;
}

public void setMudur(String mudur) {
	this.mudur = mudur;
}
}
