package ee.tlu.Marauder.controller;

import org.springframework.web.bind.annotation.RestController;

import ee.tlu.Marauder.entity.Food;
import ee.tlu.Marauder.repository.FoodRepository;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FoodController {

    @Autowired
    FoodRepository foodRepo;

    public FoodController(FoodRepository foodRepo) {
        this.foodRepo = foodRepo;
    }

    @GetMapping("food")
    public List<Food> getFood() {
        return this.foodRepo.findAll();
    }

    @GetMapping("food/{name}")
    public Food getFoodByID(@PathVariable @NonNull String name) {
        return this.foodRepo.findById(name).get();
    }

    @PostMapping("food")
    public List<Food> postFood(@RequestBody @NonNull Food food) {
        this.foodRepo.save(food);
        return getFood();
    }

    @PutMapping("food")
    public List<Food> putFood(@RequestBody @NonNull Food food) {
        this.foodRepo.save(food);
        return getFood();
    }

    @DeleteMapping("food/{name}")
    public List<Food> deleteFood(@PathVariable @NonNull String name) {
        this.foodRepo.deleteById(name);
        return getFood();
    }

    @GetMapping("food/total")
    public long foodTotal() {
        return this.foodRepo.count();
    }

}
