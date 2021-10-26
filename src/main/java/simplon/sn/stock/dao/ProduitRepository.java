package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplon.sn.stock.entites.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
