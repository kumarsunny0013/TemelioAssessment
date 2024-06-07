package com.temelio.assesment.service;

import com.temelio.assesment.entity.EmailEntity;
import com.temelio.assesment.entity.NonprofitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.temelio.assesment.repository.EmailRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public List<EmailEntity> sendEmail(List<NonprofitEntity> nonprofitEntity, String content) {
        List<EmailEntity> sentEmail = nonprofitEntity.stream().map(nonprofit -> {
            String template = "Sending money to nonprofit " + nonprofit.getName() + " at address " + nonprofit.getEmail();
            EmailEntity email = new EmailEntity();
            email.setRecipientEmail(nonprofit.getEmail());
            email.setContent(content);
            email.setTimestamp(LocalDateTime.now());
            // Mock sending email by printing to console
            System.out.println("Sending email to: " + nonprofit.getEmail());
            System.out.println("Content: " + template+" "+content);
            return emailRepository.save(email);
        }).collect(Collectors.toList());
        return sentEmail;
    }

    @Override
    public List<EmailEntity> getAllSentEmails() {
        return emailRepository.findAll();
    }
}
