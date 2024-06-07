package com.temelio.assesment.service;

import com.temelio.assesment.entity.FoundationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.temelio.assesment.repository.FoundationRepository;

import java.util.List;

@Service
public class FoundationServiceImpl implements FoundationService {

    @Autowired
    private FoundationRepository foundationRepository;

    @Override
    public FoundationEntity saveFoundation(FoundationEntity foundation) {
        return foundationRepository.save(foundation);
    }
    @Override
    public List<FoundationEntity> getFoundationList() {
        return foundationRepository.findAll();
    }
}
