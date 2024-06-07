package com.temelio.assesment.service;

import com.temelio.assesment.entity.NonprofitEntity;

import java.util.List;

public interface Nonprofitservice {

    NonprofitEntity saveNonprofit(NonprofitEntity nonprofit) throws Exception;

    List<NonprofitEntity> getAllNonprofits();
}
