package com.baris.mongorestapi.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baris.mongorestapi.entity.Kullanici;
import com.baris.mongorestapi.repository.KullaniciRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/kullanici")
@RequiredArgsConstructor
public class KullaniciController {

    private final KullaniciRepository kullaniciRepository;

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }

}
