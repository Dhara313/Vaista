package com.vaistra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired

    CountryDao countryDao;

    public  ResponseEntity<String> addCountry(country country) {
        try {
              countryDao.save(country);   // update & save


            return new ResponseEntity<>("Success", HttpStatus.OK);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new String(),HttpStatus.BAD_REQUEST);

    }




   /* public ResponseEntity<List<CountryWrapper>> getCountryById(Integer id) {
        Optional<country>  country=countryDao.findById(id);
        List<country> countryFromDB=country.get();
        List<CountryWrapper> CountryForUser=new ArrayList<>();
        for (country c:countryFromDB)
        {
            CountryWrapper cw=new CountryWrapper(c.getNO(),c.getCOUNTRY(),c.getSTATUS());
            CountryForUser.add(cw);
        }
        return new ResponseEntity<>(CountryForUser,HttpStatus.OK);
    }*/


    public ResponseEntity<List<country> >getAllCountry() {
        try {
            return new ResponseEntity<>(countryDao.findAll(), HttpStatus.OK);
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }


    public ResponseEntity<String> deleteCountry(Integer id) {

        try {
            countryDao.deleteById(id);
            return new ResponseEntity<>("Success", HttpStatus.OK);

            }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new String(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateCountry(country country) {
        try {
            countryDao.save(country);   // update & save


            return new ResponseEntity<>("Success", HttpStatus.OK);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new String(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<String> getCountry(Integer id) {
        try {
            countryDao.findById(id) ;


            return new ResponseEntity<>("Success", HttpStatus.OK);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new String(),HttpStatus.BAD_REQUEST);



    }
}
