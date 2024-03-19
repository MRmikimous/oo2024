package ee.tlu.Marauder.controller;

import org.springframework.web.bind.annotation.RestController;

import ee.tlu.Marauder.component.FoodComponent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FoodComponentController {
    List<FoodComponent> foodComponents = new ArrayList<FoodComponent>();

    @PostMapping("foodComponent")
    public List<FoodComponent> addFoodComponent(@RequestBody FoodComponent food) {
        foodComponents.add(food);

        return foodComponents;
    }

    @PutMapping("foodComponent/{index}")
    public List<FoodComponent> setFoodComponent(@PathVariable int index, @RequestBody FoodComponent food) {
        foodComponents.set(index, food);

        return foodComponents;
    }

}
