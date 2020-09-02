package com.charles.billing_postpaid_client.controllers;

import com.charles.billing_postpaid_client.models.Bill;
import com.charles.billing_postpaid_client.models.InquiryRequest;
import com.charles.billing_postpaid_client.models.InquiryResponse;
import com.charles.billing_postpaid_client.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inquiry")
public class PostpaidClientInquiryController {

    @Autowired
    private BillRepository billRepository;

    @PostMapping("/")
    public InquiryResponse doInquiry(@RequestBody InquiryRequest inquiryRequest) {
        Bill bill = billRepository.findFirstByBillerIdAndCustomerAccountIdAndStatusOrderByDueDate(
                inquiryRequest.getBillerId(),
                inquiryRequest.getUserInput(),
                "available"
        );
        InquiryResponse response = new InquiryResponse();
        response.setBillerId(bill.getBillerId());
        response.setCustomerAccountId(bill.getCustomerAccountId());
        response.setDueDate(bill.getDueDate());
        response.setTotalAmount(bill.getTotalAmount());
        return response;
    }

}
