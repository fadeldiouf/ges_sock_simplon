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

import simplon.sn.stock.entites.Fournisseur;
import simplon.sn.stock.service.FournisseurService;
@CrossOrigin("*")
@RestController
@RequestMapping("/fournisseurs")
public class FournisseurController {
	@Autowired
	private FournisseurService fournisseurService;
	@GetMapping("/all")
	public List<Fournisseur> getAllFournisseur(){
		
		return fournisseurService.getAllFournisseur();
		
	}
	@PostMapping("/save")
	public Fournisseur savefounisseur(@RequestBody Fournisseur f) {
		return fournisseurService.create(f);
	}
	@PutMapping("/update/{id}")
	public Boolean updatefournisseur(@PathVariable ("id") Long id, @RequestBody Fournisseur f) {
		return fournisseurService.update(id,f);
	}
	@GetMapping("/{id}")
	public Optional<Fournisseur> findById(@PathVariable("id") Long id){
		return fournisseurService.findById(id);
	}

}
