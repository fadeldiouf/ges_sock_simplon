package simplon.sn.stock.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
//@Data
//@NoArgsConstructor @AllArgsConstructor @ToString
//@Getter
//@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "id")
public class Gerant  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String addresse;
	private String telephone;
	private String email;
	private String civilite;
	private String genre;
	private String cni;
	@OneToOne(targetEntity=Magasin.class,mappedBy = "gerant")
    private Magasin magasin;
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gerant(String nom, String prenom, String addresse, String telephone, String email, String civilite,
			String genre, String cni, Magasin magasin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
		this.telephone = telephone;
		this.email = email;
		this.civilite = civilite;
		this.genre = genre;
		this.cni = cni;
		this.magasin = magasin;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	

}
