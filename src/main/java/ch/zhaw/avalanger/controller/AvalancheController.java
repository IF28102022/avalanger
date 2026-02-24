package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/avalange")
public class AvalancheController {

    @GetMapping(value = { "", "/{country}" })
    public String getAllAvalange(@PathVariable(required = false) String country,
            @RequestParam(required = false) String state) {
        return "Get all avalange for country: " + country + " and state: " + state;
    }

}
