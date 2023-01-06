package org.example.Payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
