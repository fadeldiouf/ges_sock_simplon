package simplon.sn.stock.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
@Entity 
//@Data @NoArgsConstructor @AllArgsConstructor @ToString
//@Getter
//@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "id")
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	private Double prixunitaire;
	private Long  quantite_stock;
	private Boolean disponible=true;
	private String photo;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Depot depot;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, String description, Double prixunitaire, Boolean disponible, String photo,
			Categorie categorie, Depot depot) {
		super();
		this.nom = nom;
		this.description = description;
		this.prixunitaire = prixunitaire;
		this.disponible = disponible;
		this.photo = photo;
		this.categorie = categorie;
		this.depot = depot;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrixunitaire() {
		return prixunitaire;
	}
	public void setPrixunitaire(Double prixunitaire) {
		this.prixunitaire = prixunitaire;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@JsonIdentityReference
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@JsonIdentityReference
	public Depot getDepot() {
		return depot;
	}
	public void setDepot(Depot depot) {
		this.depot = depot;
	}

}
