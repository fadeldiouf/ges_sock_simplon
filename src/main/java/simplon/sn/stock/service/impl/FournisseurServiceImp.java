package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.FournisseurRepository;
import simplon.sn.stock.entites.Fournisseur;
import simplon.sn.stock.service.FournisseurService;
@Service
public class FournisseurServiceImp  implements FournisseurService{
	@Autowired
	private FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> getAllFournisseur() {
		// TODO Auto-generated method stub
		return fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur create(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(f);
	}

	@Override
	public Boolean update(Long id,Fournisseur f) {
		// TODO Auto-generated method stub
		Boolean updated= true;
		Optional<Fournisseur> fournisseur = fournisseurRepository.findById(f.getId());
		if(fournisseur.isPresent()) {
			fournisseurRepository.save(f);
			return updated;
		}
		return false;
	}

	@Override
	public Optional<Fournisseur> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Fournisseur> fournisseur = fournisseurRepository.findById(id);
		if(fournisseur.isPresent()) {
			return fournisseur;
		}
		return null;
	}

}
