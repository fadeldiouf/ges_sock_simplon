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

import simplon.sn.stock.entites.Depot;
import simplon.sn.stock.service.DepotService;
@CrossOrigin("*")
@RestController
@RequestMapping("/depots")
public class DepotController {
	@Autowired 
	private DepotService depotService;
	
	@GetMapping("/all")
	public List<Depot> getAllDepot(){
		return depotService.findAllDepots();
	}
	@PostMapping("/save")
	public Depot savedepot(@RequestBody Depot d) {
		return depotService.create(d);
	}
	
	@PutMapping("/update/{id}")
	public Boolean updatedepot(@PathVariable ("id") Long id, @RequestBody Depot d) {
		return depotService.update(id,d);
	}
	
	@GetMapping("/{id}")
	public Optional<Depot> findById(@PathVariable("id") Long id){
		return depotService.findById(id);
	}

}
