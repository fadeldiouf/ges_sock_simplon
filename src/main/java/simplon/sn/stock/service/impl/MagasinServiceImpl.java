package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.MagasinRepository;
import simplon.sn.stock.entites.Magasin;
import simplon.sn.stock.service.MagasinService;

@Service
public class MagasinServiceImpl implements MagasinService {
	@Autowired
	private MagasinRepository magasinRepository;

	@Override
	public List<Magasin> findMagasins() {
		// TODO Auto-generated method stub
		return magasinRepository.findAll();
	}

	@Override
	public Magasin create(Magasin m) {
		// TODO Auto-generated method stub
		return magasinRepository.save(m);
	}

	@Override
	public Boolean update(Long id,Magasin m) {
		// TODO Auto-generated method stub
		Boolean updated=true;
		Optional<Magasin> magasin= magasinRepository.findById(m.getId());
		if(magasin.isPresent()) {
			magasinRepository.save(m);
			return updated;
		}
		return false;
	}

	@Override
	public Optional<Magasin> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Magasin> magasin= magasinRepository.findById(id);
		if(magasin.isPresent()) {
			return magasin;
		}
		return null;
	}

}
