package com.vaistra;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("country")

public class countryController {

    @Autowired
    CountryService countryService;

    @GetMapping("allCountry")
    public ResponseEntity<List<country>> getAllCountry() {
        return countryService.getAllCountry();
    }

    @PostMapping("add")
    public ResponseEntity<String> addCountry(@RequestBody country country) {
        return countryService.addCountry(country);


    }
    @PostMapping("update")
    public ResponseEntity<String>  updateCountry(@RequestBody country country) {
        return countryService.updateCountry(country);


    }


    @DeleteMapping ("delete/{id}")
    public ResponseEntity<String> deleteCountry(@PathVariable Integer id) {
        return countryService.deleteCountry(id);

    }
  @GetMapping("Get/{id}")
   public ResponseEntity<String> getCountry(@RequestParam Integer id) {
        return countryService.getCountry(id);
    }


}