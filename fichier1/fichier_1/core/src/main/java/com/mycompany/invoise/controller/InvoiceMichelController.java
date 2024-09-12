package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceMichelController implements InvoiceControllerInterface {

  private InvoiceServiceInterface invoiceService;

  public InvoiceMichelController(InvoiceServiceInterface invoiceService){
    this.invoiceService = invoiceService;
  }

  public void createInvoice(){

        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.creatInvoice(invoice);
  }

}
