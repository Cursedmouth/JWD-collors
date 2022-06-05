package pl.edu.wszib.jwdcollors.service;

import pl.edu.wszib.jwdcollors.model.SelectedColor;

import java.util.List;

public interface SelectedColorService {
    void save(String color);
    void save(SelectedColor selectedColor);
    List<SelectedColor> getAllData();
}
