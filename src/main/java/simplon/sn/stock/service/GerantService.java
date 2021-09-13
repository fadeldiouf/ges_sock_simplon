package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Gerant;

public interface GerantService {
	
	public List<Gerant> findGerants();
	
	public Gerant create (Gerant g);
	
	public Boolean update (Long id,Gerant g);
	
	public Optional<Gerant> findById(Long id);
	

	public List<Gerant> findGerantsNotMagasin();
}
