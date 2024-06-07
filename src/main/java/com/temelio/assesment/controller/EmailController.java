package com.temelio.assesment.controller;

import com.temelio.assesment.entity.EmailEntity;
import com.temelio.assesment.entity.NonprofitEntity;
import com.temelio.assesment.exception.NotFoundException;
import com.temelio.assesment.model.EmailRequest;
import com.temelio.assesment.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.temelio.assesment.service.NonprofitserviceImpl;

import java.util.List;

@RestController
@RequestMapping("/v1/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private NonprofitserviceImpl nonProfitService;

    @PostMapping("/send")
    public List<EmailEntity> sendEmails(@RequestBody EmailRequest emailRequest) {
        List<NonprofitEntity> nonprofits = nonProfitService.getAllNonprofits();
        if (nonprofits.isEmpty()) {
            throw new NotFoundException("No nonprofits found. Please create nonprofit first");
        }
        emailService.sendEmail(nonprofits,emailRequest.getTemplate());
        return emailService.getAllSentEmails();
    }

    @GetMapping
    public List<EmailEntity> getAllSentEmails() {
        return emailService.getAllSentEmails();
    }

}
