package ee.tlu.spike;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/traveller")
public class TravellerMileageController {

    @Autowired
    TravellerRepository travellerRepo;

    public TravellerMileageController(TravellerRepository travellerRepo) {
        this.travellerRepo = travellerRepo;
    }

    @PutMapping("/mileage/{id}")
    public Traveller putMethodName(@PathVariable String id, @RequestBody Mileage mileage) {
        Traveller traveller = travellerRepo.findById(Long.parseLong(id)).get();
        traveller.setMileage(mileage.getMileage());
        travellerRepo.save(traveller);
        return traveller;
    }

    @GetMapping("/mileage/biggest")
    public Traveller getBiggestMileage() {
        Traveller traveller = travellerRepo.findAllByOrderByMileageDesc().get(0);
        return traveller;
    }

}
