package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Magasin;

public interface MagasinService {
	public List<Magasin> findMagasins();
	
	public Magasin create(Magasin m);
	
	public Boolean update(Long id, Magasin m);
	
	public Optional<Magasin> findById(Long id);
	


}
