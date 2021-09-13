package simplon.sn.stock.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;


@Entity
//@Data
//@NoArgsConstructor @AllArgsConstructor @ToString
//@Getter
//@Setter
public class Magasin  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Date date;
	private String addresse;
	private String telephone;
	private String email;
	@OneToOne(targetEntity=Gerant.class)
	@JoinColumn(name = "gerant_id")
	private Gerant gerant;
	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magasin(String nom, Date date, String addresse, String telephone, String email, Gerant gerant) {
		super();
		this.nom = nom;
		this.date = date;
		this.addresse = addresse;
		this.telephone = telephone;
		this.email = email;
		this.gerant = gerant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonIdentityReference
	public Gerant getGerant() {
		return gerant;
	}
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	

}
