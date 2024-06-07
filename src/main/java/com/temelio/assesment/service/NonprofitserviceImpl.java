package com.temelio.assesment.service;

import com.temelio.assesment.entity.NonprofitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.temelio.assesment.repository.NonProfitRepository;

import java.util.List;

@Service
public class NonprofitserviceImpl implements Nonprofitservice {

    @Autowired
    private NonProfitRepository nonProfitRepository;

    public NonprofitEntity saveNonprofit(NonprofitEntity nonprofit) throws Exception {
        try {
            return nonProfitRepository.save(nonprofit);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<NonprofitEntity> getAllNonprofits() {
        return nonProfitRepository.findAll();
    }
}
