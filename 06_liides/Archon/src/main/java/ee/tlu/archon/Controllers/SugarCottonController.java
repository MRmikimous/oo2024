package ee.tlu.archon.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ee.tlu.archon.SugarCotton;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class SugarCottonController {
    private List<SugarCotton> SugarCottonList = new ArrayList<SugarCotton>();

    @GetMapping("SugarCotton/total")
    public int getTotal() {
        int total = 0;
        for (SugarCotton sugarCotton : SugarCottonList) {
            total += sugarCotton.getSugar();
        }
        return total;
    }

    @GetMapping("SugarCotton")
    public List<SugarCotton> getSugarCotton() {
        return SugarCottonList;
    }

    @DeleteMapping("SugarCotton")
    public List<SugarCotton> deleteSugarCotton() {
        SugarCottonList.clear();

        return SugarCottonList;
    }

    @DeleteMapping("SugarCotton/{index}")
    public List<SugarCotton> deleteSugarCottonFrom(@PathVariable int index) {
        SugarCottonList.remove(index);

        return SugarCottonList;
    }

    @PostMapping("SugarCotton")
    public List<SugarCotton> addSugarCotton(@RequestBody SugarCotton sugarCotton) {
        SugarCottonList.add(sugarCotton);
        return SugarCottonList;
    }

    @PutMapping("SugarCotton/{index}")
    public List<SugarCotton> putSugarCotton(@RequestBody SugarCotton sugarCotton, @PathVariable int index) {
        SugarCottonList.set(index, sugarCotton);
        return SugarCottonList;
    }

}
