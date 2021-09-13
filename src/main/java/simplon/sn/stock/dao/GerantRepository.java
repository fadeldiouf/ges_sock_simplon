package simplon.sn.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import simplon.sn.stock.entites.Gerant;

public interface GerantRepository extends JpaRepository<Gerant, Long> {

	@Query("select g FROM Gerant g where g is null")
	public List<Gerant> gerantsNotMagasin();
}
