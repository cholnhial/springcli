package com.cholnhial.springcli.service.mapper;

import com.cholnhial.springcli.model.Feedback;
import com.cholnhial.springcli.service.dto.FeedbackRequest;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class FeedbackMapper {

    Feedback feedbackRequestToFeedback(FeedbackRequest feedbackRequest) {
       var fbuilder = Feedback.builder();
       fbuilder.feedback(feedbackRequest.getFeedback());
       fbuilder.name(feedbackRequest.getName());
       fbuilder.email(feedbackRequest.getEmail());
       fbuilder.phone(feedbackRequest.getPhone());
       fbuilder.created(ZonedDateTime.now());
       return fbuilder.build();
    }
}
