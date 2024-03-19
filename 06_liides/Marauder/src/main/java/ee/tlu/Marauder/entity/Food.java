package ee.tlu.Marauder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Food {
    @Id
    private String name;

    private int price;

    @Override
    public String toString() {
        return String.format("%s [%s]", name, price);
    }

    public void replace(Food food) {
        this.name = food.getName();
        this.price = food.getPrice();
    }
}
