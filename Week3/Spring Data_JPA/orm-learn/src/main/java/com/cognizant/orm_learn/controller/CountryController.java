package com.cognizant.orm_learn.controller;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<Country> getCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code)
    {
        return countryService.getCountry(code);
    }


    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return countryService.findCountriesByPartialName(name);
    }
}
