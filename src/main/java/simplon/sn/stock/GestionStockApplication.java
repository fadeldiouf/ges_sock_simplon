package simplon.sn.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner{
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
//		Produit p = new Produit("sass", "venant", 15000d, null, "marteau.jpg", null, null);
//         produitRepository.save(p);
//		
	}

}
