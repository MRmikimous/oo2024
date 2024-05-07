package ee.tlu.spike;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerRepository extends JpaRepository<Traveller, Long> {
    List<Traveller> findAllByOrderByMileageDesc();
}
