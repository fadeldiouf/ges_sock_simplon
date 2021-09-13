package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Depot;

public interface DepotService {

	public List<Depot> findAllDepots();
	
	public Depot create (Depot d);
	
	public Boolean update(Long id ,Depot d);
	
	public Optional<Depot> findById(Long id);
}
