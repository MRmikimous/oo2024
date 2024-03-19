package ee.tlu.Marauder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.tlu.Marauder.entity.Food;

public interface FoodRepository extends JpaRepository<Food, String> {

}
