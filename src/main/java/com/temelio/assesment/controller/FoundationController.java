package com.temelio.assesment.controller;

import com.temelio.assesment.entity.FoundationEntity;
import com.temelio.assesment.service.FoundationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/foundations")
public class FoundationController {

    @Autowired
    private FoundationService foundationService;

    @PostMapping
    public FoundationEntity createFoundation(@RequestBody FoundationEntity foundation) {
        return foundationService.saveFoundation(foundation);
    }

    @GetMapping
    public List<FoundationEntity> getFoundation() {
        return foundationService.getFoundationList();
    }
}
