package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.DepotRepository;
import simplon.sn.stock.entites.Depot;
import simplon.sn.stock.service.DepotService;
@Service
public class DepotServiceImpl implements DepotService {
@Autowired
DepotRepository depotRepository;
	@Override
	public List<Depot> findAllDepots() {
		// TODO Auto-generated method stub
		return depotRepository.findAll();
	}

	@Override
	public Depot create(Depot d) {
		// TODO Auto-generated method stub
		return depotRepository.save(d);
	}

	@Override
	public Boolean update(Long id, Depot d) {
		// TODO Auto-generated method stub
		Boolean update= true;
		Optional<Depot> depot = depotRepository.findById(d.getId());
		if(depot.isPresent()) {
			depotRepository.save(d);
			return update;
		}
		return false;
	}

	@Override
	public Optional<Depot> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Depot> depot = depotRepository.findById(id);
		if(depot.isPresent()) {
			return depot;
		}
		
		return null;
	}

	
}
