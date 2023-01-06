package org.example.Payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.example.Payments.PaymentResponse.PaymentStatus.*;
import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;

    @Before
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(OK));


        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_incorrect() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(ERROR));

        assertFalse(paymentProcessor.makePayment(13040));
    }
}