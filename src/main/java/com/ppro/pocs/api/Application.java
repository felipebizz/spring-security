package com.ppro.pocs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ppro.pocs.api.model.Merchant;
import com.ppro.pocs.api.service.MerchantService;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private MerchantService service;

    @GetMapping("/getAllMerchants")
    public List<Merchant> getMerchants() {
        System.out.println("Controller getMerchants() method called...");
        return service.findAllMerchants();
    }

    @PostMapping("/saveMerchant")
    public Merchant saveMerchant(@RequestBody Merchant merchant) {
        System.out.println("Controller saveMerchant() method called...");
        return service.saveMerchant(merchant);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

