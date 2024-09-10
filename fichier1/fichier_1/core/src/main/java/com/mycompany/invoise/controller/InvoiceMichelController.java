package com.mycompany.invoise.controller;

import java.util.Scanner;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceMichel;

public class InvoiceMichelController {

  public void createControllerUsingWeb(){

        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
        invoiceServiceMichel.creatInvoice(invoice);
  }

}
