package com.ppro.pocs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppro.pocs.api.model.Merchant;
import com.ppro.pocs.api.repository.MerchantRepository;

@Service
public class MerchantService {

    @Autowired
    private MerchantRepository repository;

    public Merchant saveMerchant(Merchant merchant) {
        System.out.println("Service saveMerchant() method Called...");
        return repository.save(merchant);
    }

    public List<Merchant> findAllMerchants() {
        System.out.println("Service findAllMerchants() method Called...");
        return repository.findAll();
    }

}
