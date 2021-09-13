package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Produit;

public interface ProduitService {
	public List<Produit> findAllProduit();
	
	public Produit create (Produit p);
	
	public Boolean update (Long id, Produit p );
	
	public Optional< Produit> findById(Long id);
	

}
