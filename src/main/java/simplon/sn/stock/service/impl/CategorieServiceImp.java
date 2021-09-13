package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.CategorieRepository;
import simplon.sn.stock.entites.Categorie;
import simplon.sn.stock.service.CategorieService;
@Service
public class CategorieServiceImp implements CategorieService{
@Autowired
 private CategorieRepository categorieRepository;
	@Override
	public List<Categorie> findAllCategorie() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie create(Categorie c) {
		// TODO Auto-generated method stub
		return categorieRepository.save(c);
	}

	@Override
	public Boolean update(Long id, Categorie c) {
		// TODO Auto-generated method stub
		Boolean updated = true;
		Optional<Categorie> categorie= categorieRepository.findById(c.getId());
		if(categorie.isPresent()) {
			categorieRepository.save(c);
			return updated;
		}
		return false;
	}

	@Override
	public Optional<Categorie> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Categorie> categorie= categorieRepository.findById(id);
		if(categorie.isPresent()) {
			return categorie;
		}
		return null;
	}

}
