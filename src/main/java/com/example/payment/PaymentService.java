package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Create a new payment
    public payment createPayment(payment newPayment) {
        return paymentRepository.save(newPayment);
    }

    // Get all payments
    public List<payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Get a specific payment by ID
    public Optional<payment> getPaymentById(String id) {
        return paymentRepository.findById(id);
    }

    // Update an existing payment
    public payment updatePayment(String id, payment updatedPayment) {
        return paymentRepository.findById(id)
            .map(existingPayment -> {
                existingPayment.setsubscriptionplan(updatedPayment.getsubscriptionplan());
                existingPayment.setpaymentmode(updatedPayment.getpaymentmode());
                existingPayment.setpaymentreferenceid(updatedPayment.getpaymentreferenceids());
                existingPayment.setperiodofsubscription(updatedPayment.getperiodofsubscription());
                existingPayment.settotalamountpaid(updatedPayment.gettotalamountpaid());
                existingPayment.sethowdoyouchooseus(updatedPayment.gethowdoyouchooseus());
                existingPayment.setmentionthereferredpersonname(updatedPayment.getmentionthereferredpersonname());
                existingPayment.setprimaryreport(updatedPayment.getprimaryreport());
                existingPayment.setdateofsubscription(updatedPayment.getdateofsubscription());
                existingPayment.setwelcomemail(updatedPayment.getwelcomemail());
                return paymentRepository.save(existingPayment);
            })
            .orElseThrow(() -> new RuntimeException("Payment not found with id: " + id));
    }

    // Delete a payment
    public void deletePayment(String id) {
        paymentRepository.deleteById(id);
    }
}
