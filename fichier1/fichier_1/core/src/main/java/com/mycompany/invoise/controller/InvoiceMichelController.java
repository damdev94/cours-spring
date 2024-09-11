package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceMichelController implements InvoiceControllerInterface {

  private InvoiceServiceInterface invoiceServiceInterface;

  public void createInvoice(){

        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.creatInvoice(invoice);
  }

}
