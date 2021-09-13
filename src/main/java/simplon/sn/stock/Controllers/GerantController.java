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

import simplon.sn.stock.entites.Gerant;
import simplon.sn.stock.service.GerantService;
@CrossOrigin("*")
@RestController
@RequestMapping("/gerants")
public class GerantController  {

@Autowired
private GerantService gerantService;


      @GetMapping("/all")
     public List<Gerant> getAllGerants(){
    	 
		return gerantService.findGerants();
    	 
     }

      @PostMapping("/save")
      public Gerant saveGerant(@RequestBody Gerant g){
     	 
 		return gerantService.create(g);
     	 
      }
      
      @PutMapping("/update/{id}")
      public Boolean updateGerants(@PathVariable ("id") Long id, @RequestBody Gerant g){
     	 
 		return gerantService.update(id,g);
     	 
      }
      
      @GetMapping("/{id}")
      public Optional<Gerant> getGerantsById(@PathVariable("id")Long id){
     	 
 		return gerantService.findById(id);
     	 
      }
      
      @GetMapping("/notMagasins")
      public List<Gerant> getAllGerantsNotMagasin(){
     	 
 		return gerantService.findGerantsNotMagasin();
     	 
      }
}
