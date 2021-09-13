package simplon.sn.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.sn.stock.entites.Depot;

public interface DepotRepository extends JpaRepository<Depot, Long> {

}
