package com.temelio.assesment.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Email {

    private Long id;
    private String recipientEmail;
    private String content;
    private LocalDateTime timestamp;
}
