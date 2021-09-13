package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Categorie;

public interface CategorieService {
	public List<Categorie> findAllCategorie();
	
	public Categorie create (Categorie c);
	
	public Boolean update (Long id,Categorie c);
	
	public Optional< Categorie> findById(Long id);


}
