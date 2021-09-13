package simplon.sn.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;
import simplon.sn.stock.service.ProduitService;
@Service
public class ProduitServiceImpl  implements ProduitService{
@Autowired 
private ProduitRepository produitRepository;
	@Override
	public List<Produit> findAllProduit() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit create(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public Boolean update(Long id, Produit p ) {
		// TODO Auto-generated method stub
		Boolean updated= true;
		Optional<Produit> produit= produitRepository.findById(p.getId());
		if(produit.isPresent()) {
			produitRepository.save(p);
			return updated;
		}
		return false;
	}

	@Override
	public Optional<Produit> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Produit> produit= produitRepository.findById(id);
		if(produit.isPresent()) {
			return produit;
		}
		return null;
	}

}
