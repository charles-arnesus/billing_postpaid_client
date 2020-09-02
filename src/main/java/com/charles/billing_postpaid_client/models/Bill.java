package com.charles.billing_postpaid_client.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "postpaid_bill")
@IdClass(BillId.class)
public class Bill implements Serializable {

    @Id
    @Column(name = "biller_id")
    private String billerId;
    @Id
    @Column(name = "customer_account_id")
    private String customerAccountId;
    @Id
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "status")
    private String status;
    @Column(name = "payment_id")
    private UUID paymentId;
    @Column(name = "payment_date")
    private LocalDate paymentDate;

    public Bill() {

    }

    public Bill(
            String billerId,
            String customerAccountId,
            LocalDate dueDate,
            Double totalAmount,
            String status,
            UUID paymentId,
            LocalDate paymentDate) {
        this.billerId = billerId;
        this.customerAccountId = customerAccountId;
        this.dueDate = dueDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
