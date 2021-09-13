package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.sn.stock.entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
