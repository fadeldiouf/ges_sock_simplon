package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.sn.stock.entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
