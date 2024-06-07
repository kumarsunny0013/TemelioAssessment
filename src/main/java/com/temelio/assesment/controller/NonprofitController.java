package com.temelio.assesment.controller;

import com.temelio.assesment.entity.NonprofitEntity;
import com.temelio.assesment.service.Nonprofitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/nonprofits")
public class NonprofitController {

    @Autowired
    private Nonprofitservice nonprofitService;


    @PostMapping
    public NonprofitEntity createNonprofit(@RequestBody NonprofitEntity nonprofit) throws Exception {
        return nonprofitService.saveNonprofit(nonprofit);
    }

    @GetMapping
    public List<NonprofitEntity> getAllNonprofits() {
        return nonprofitService.getAllNonprofits();
    }
}
