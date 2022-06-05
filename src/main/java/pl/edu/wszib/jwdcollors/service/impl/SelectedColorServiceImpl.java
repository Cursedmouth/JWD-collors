package pl.edu.wszib.jwdcollors.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdcollors.dao.SelectedColorDao;
import pl.edu.wszib.jwdcollors.model.SelectedColor;
import pl.edu.wszib.jwdcollors.service.SelectedColorService;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class SelectedColorServiceImpl implements SelectedColorService {

    @Autowired
    SelectedColorDao selectedColorDao;

    @Override
    public void save(String color) {
        selectedColorDao.save(new SelectedColor(color, new Date()));
    }

    @Override
    public void save(SelectedColor selectedColor) {
        selectedColorDao.save(selectedColor);
    }

    @Override
    public List<SelectedColor> getAllData() {
        return (List<SelectedColor>)selectedColorDao.findAll();

        //create test ctr+shift +t
    }
}
