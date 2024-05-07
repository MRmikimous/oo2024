package ee.tlu.spike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/traveller")
public class TravellerController {

    @Autowired
    TravellerRepository travellerRepo;

    public TravellerController(TravellerRepository travellerRepo) {
        this.travellerRepo = travellerRepo;
    }

    @GetMapping("")
    public List<Traveller> getTravellers() {
        return travellerRepo.findAll();
    }

    @GetMapping("/{id}")
    public Traveller getTraveller(@PathVariable long id) {
        return travellerRepo.findById(id).get();
    }

    @PostMapping("/")
    public Traveller createTraveller(@RequestBody Traveller traveller) {
        return travellerRepo.save(traveller);
    }

    @DeleteMapping("/{id}")
    public void deleteTraveller(@PathVariable long id) {
        travellerRepo.deleteById(id);
    }
}
