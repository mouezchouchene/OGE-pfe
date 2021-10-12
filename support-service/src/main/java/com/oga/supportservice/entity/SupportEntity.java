package com.oga.supportservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SupportEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)

     private long id;
     private String titre;
     private String date;
     private String description_employe;
     private boolean status;
     private String fileName;
     private String reponse;
     private long idEmployee;



}
