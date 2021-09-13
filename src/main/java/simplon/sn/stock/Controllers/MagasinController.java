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

import simplon.sn.stock.entites.Magasin;
import simplon.sn.stock.service.MagasinService;
@CrossOrigin("*")
@RestController
@RequestMapping("/magasins")
public class MagasinController {
	@Autowired
	private MagasinService magasinService;
	@GetMapping("/all")
	public List<Magasin> getAllMagasins(){
		return magasinService.findMagasins();
		
	}
	@PostMapping("/save")
	public Magasin saveMagasin(@RequestBody Magasin m) {
		return magasinService.create(m);
	}
	@PutMapping("/update/{id}")
	public Boolean update(@PathVariable("id") Long id, @RequestBody Magasin m) {
		return magasinService.update(id,m);
	}
	@GetMapping("/{id}")
	public Optional<Magasin> getMagasinById(@PathVariable("id") Long id){
		return magasinService.findById(id);
	}
	
	
	

}
