package com.baris.mongorestapi.entity;

import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Kullanici {
    private String id;
    private String adi;
    private String soyadi;
    private HashMap<String, String> ozellikler;
}
