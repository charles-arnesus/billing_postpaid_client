package com.charles.billing_postpaid_client.controllers;

import com.charles.billing_postpaid_client.models.InquiryRequest;
import com.charles.billing_postpaid_client.models.InquiryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

@RestController
@RequestMapping("/api/inquiry")
public class PostpaidClientInquiryController {

    @PostMapping("/")
    public InquiryResponse doInquiry(@RequestBody InquiryRequest inquiryRequest) {
        InquiryResponse response = new InquiryResponse();
        response.setBillerId(inquiryRequest.getBillerId());
        response.setCustomerAccountId(inquiryRequest.getUserInput());
        response.setDueDate(LocalDate.of(2020, Month.DECEMBER, 20));
        response.setTotalAmount(70000.00);
        return response;
    }

}
