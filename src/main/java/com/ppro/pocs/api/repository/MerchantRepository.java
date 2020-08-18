package com.ppro.pocs.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppro.pocs.api.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {

}
