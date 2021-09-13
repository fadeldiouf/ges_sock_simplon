package simplon.sn.stock.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplon.sn.stock.entites.Categorie;
import simplon.sn.stock.service.CategorieService;
@CrossOrigin("*")
@RestController
@RequestMapping("/categories")
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping("/all")
	public List<Categorie> getAllCategorie(){
		return categorieService.findAllCategorie();
		
	}
	@PostMapping("/save" )
	public Categorie savecategorie (@RequestBody Categorie c ) {
		return categorieService.create(c);
	}
	@PutMapping("/update/{id}")
	public Boolean updatecategorie (@PathVariable("id") Long id, @RequestBody Categorie c) {
		return categorieService.update(id, c);
	}
	@GetMapping("/{id}")
	public Optional<Categorie> findById(@PathVariable("id") Long id){
		return categorieService.findById(id);
	}
	
}
