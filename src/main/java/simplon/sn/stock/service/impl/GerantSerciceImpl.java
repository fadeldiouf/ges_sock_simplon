package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.GerantRepository;
import simplon.sn.stock.entites.Gerant;
import simplon.sn.stock.service.GerantService;

@Service
public class GerantSerciceImpl implements GerantService {

	@Autowired
	private GerantRepository gerantRepository;

	@Override
	public List<Gerant> findGerants() {
		// TODO Auto-generated method stub
		return gerantRepository.findAll();
	}

	@Override
	public Gerant create(Gerant g) {
		// TODO Auto-generated method stub
		return gerantRepository.save(g);
	}

	@Override
	public Boolean update(Long id, Gerant g) {
		Boolean updated = true;

		Optional<Gerant> gerant = gerantRepository.findById(g.getId());

		if (gerant.isPresent()) {
			gerantRepository.save(g);
			return updated;
		}
		return false;
	}

	@Override
	public Optional<Gerant> findById(Long id) {

		Optional<Gerant> gerant = gerantRepository.findById(id);
		
		if (gerant.isPresent()) {
			return gerant;
		}
		
		return null;
		
	}

	@Override
	public List<Gerant> findGerantsNotMagasin() {
		// TODO Auto-generated method stub
		return gerantRepository.gerantsNotMagasin();
	}

}
