package pl.edu.wszib.jwdcollors.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdcollors.model.SelectedColor;

@Repository
public interface SelectedColorDao extends CrudRepository<SelectedColor, Integer> {
    SelectedColor findFirstByColor(String color);

}
