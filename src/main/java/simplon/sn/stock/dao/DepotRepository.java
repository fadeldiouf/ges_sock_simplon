package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplon.sn.stock.entites.Depot;

@Repository
public interface DepotRepository extends JpaRepository<Depot, Long> {

}
