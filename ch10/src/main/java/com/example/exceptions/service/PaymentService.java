package com.example.exceptions.service;

import com.example.exceptions.exceptions.NotEnoughMoneyException;
import com.example.exceptions.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  public PaymentDetails processPayment() {
    throw new NotEnoughMoneyException();
  }
}
