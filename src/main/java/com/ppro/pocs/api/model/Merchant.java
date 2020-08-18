package com.ppro.pocs.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Merchant")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Merchant {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Date creationDate;

}
