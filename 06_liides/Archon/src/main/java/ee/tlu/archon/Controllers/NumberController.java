package ee.tlu.archon.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ee.tlu.archon.NumberEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class NumberController {
    List<Integer> numbers = new ArrayList<>();

    @GetMapping("numbers/len")
    public int getLen() {
        return numbers.size();
    }

    @GetMapping("numbers")
    public List<Integer> getNumbers() {
        return numbers;
    }

    @PostMapping("number")
    public List<Integer> addNumber(@RequestBody NumberEntity number) {
        numbers.add(number.getNumber());

        return numbers;
    }


    @DeleteMapping("numbers")
    public List<Integer> deleteNumbers() {
        numbers.clear();

        return numbers;
    }

    @DeleteMapping("numbers/{id}")
    public List<Integer> deleteNumber(@PathVariable int id) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == id) {
                numbers.remove(i);
                return numbers;
            }
        }

        return numbers;
    }

    @GetMapping("numbers/total")
    public int getTotal() {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    @GetMapping("numbers/average")
    public double getAverage() {
        return getTotal() / numbers.size();
    }


}
