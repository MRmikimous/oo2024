package ee.tlu.Marauder.Controllers;

import org.springframework.web.bind.annotation.RestController;

import ee.tlu.Marauder.Food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FoodController {

    List<Food> foodList = new ArrayList<Food>();

    @GetMapping("food")
    public List<Food> getFood() {
        return foodList;
    }

    @GetMapping("food/{id}")
    public Food getFoodByID(@PathVariable int id) {
        return foodList.get(id);
    }

    @PostMapping("food")
    public List<Food> postFood(@RequestBody Food food) {
        foodList.add(food);
        return foodList;
    }

    @PutMapping("food/{id}")
    public List<Food> putFood(@PathVariable int id, @RequestBody Food food) {
        foodList.get(id).replace(food);
        return foodList;
    }

    @DeleteMapping("food/{id}")
    public List<Food> deleteFood(@PathVariable int id) {
        foodList.remove(id);
        return foodList;
    }

    @GetMapping("food/total")
    public int foodTotal() {
        return foodList.size();
    }

}
