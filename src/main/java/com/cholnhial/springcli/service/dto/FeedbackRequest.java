package com.cholnhial.springcli.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class FeedbackRequest {

    @NotBlank(message = "Provide a name")
    private String name;
    @NotBlank(message = "Provide an email address e.g john@gmail.com")
    private String email;
    @NotBlank(message = "Provide a phone number")
    private String phone;
    @NotBlank(message = "You need to write something")
    private String feedback;
}
