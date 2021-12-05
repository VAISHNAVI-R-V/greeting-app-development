package com.bridgelabz.greetingappdevelopment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "greeting")
public class GreetingAppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String content;
}