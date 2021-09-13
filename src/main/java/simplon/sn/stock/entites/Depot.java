package simplon.sn.stock.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
//@Data @NoArgsConstructor @AllArgsConstructor @ToString
//@Getter
//@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "id")
public class Depot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private Date date;
	private int quantiteinitial;
	private int quantitecourant;
	@OneToMany(mappedBy = "depot")
	private Collection<Produit> produits;
	@ManyToOne
	private Fournisseur fournisseur;
	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Depot(String libelle, Date date, int quantiteinitial, int quantitecourant, Collection<Produit> produits,
			Fournisseur fournisseur) {
		super();
		this.libelle = libelle;
		this.date = date;
		this.quantiteinitial = quantiteinitial;
		this.quantitecourant = quantitecourant;
		this.produits = produits;
		this.fournisseur = fournisseur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantiteinitial() {
		return quantiteinitial;
	}
	public void setQuantiteinitial(int quantiteinitial) {
		this.quantiteinitial = quantiteinitial;
	}
	public int getQuantitecourant() {
		return quantitecourant;
	}
	public void setQuantitecourant(int quantitecourant) {
		this.quantitecourant = quantitecourant;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	@JsonIdentityReference
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	
}
