package com.senatastan.web.service;

import com.senatastan.web.entities.UlasFormEntities;
import com.senatastan.web.repository.UlasFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UlasFormService {

    private final UlasFormRepository ulasFormRepository;

    @Autowired
    public UlasFormService(UlasFormRepository ulasFormRepository) {
        this.ulasFormRepository = ulasFormRepository;
    }

    // Yeni mesaj kaydetme
    public UlasFormEntities saveMessage(UlasFormEntities ulasForm) {
        return ulasFormRepository.save(ulasForm);
    }
}
