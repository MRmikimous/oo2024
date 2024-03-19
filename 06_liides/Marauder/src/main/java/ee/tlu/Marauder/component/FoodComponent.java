package ee.tlu.Marauder.component;

import ee.tlu.Marauder.entity.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FoodComponent {
    Food food;
    int amount;
}
