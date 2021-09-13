package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.sn.stock.entites.Magasin;

public interface MagasinRepository extends JpaRepository<Magasin, Long> {

}
