package com.temelio.assesment.service;

import com.temelio.assesment.entity.FoundationEntity;

import java.util.List;

public interface FoundationService {
    FoundationEntity saveFoundation(FoundationEntity foundation);
    List<FoundationEntity> getFoundationList();
}
