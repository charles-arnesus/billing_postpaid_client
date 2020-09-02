package com.charles.billing_postpaid_client.models;

public class InquiryRequest {
    private String billerId;
    private String userInput;

    public InquiryRequest() {

    }

    public InquiryRequest(String billerId, String userInput) {
        this.billerId = billerId;
        this.userInput = userInput;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
