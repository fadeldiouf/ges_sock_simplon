package simplon.sn.stock.Controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;
@RestController

public class ImagesController {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private ServletContext context;
	@GetMapping(path = "/getphoto/{id}")
	public byte[] getIamges (@PathVariable ("id") Long id) throws IOException {
		Produit produit= produitRepository.findById(id).get();
		
			return Files.readAllBytes(Paths.get(context.getRealPath("/images/")+produit.getPhoto()));
		}

}
