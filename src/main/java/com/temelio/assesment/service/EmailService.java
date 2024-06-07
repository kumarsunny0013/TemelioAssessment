package com.temelio.assesment.service;

import com.temelio.assesment.entity.EmailEntity;
import com.temelio.assesment.entity.NonprofitEntity;

import java.util.List;

public interface EmailService {
    List<EmailEntity> sendEmail(List<NonprofitEntity> nonprofitEntity, String content);

    List<EmailEntity> getAllSentEmails();
}
