package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerDouchette implements InvoiceControllerInterface{

  InvoiceServiceInterface invoiceService;

  public InvoiceServiceInterface getInvoiceService() {
    return invoiceService;
  }

  public void setInvoiceService(InvoiceServiceInterface invoiceServiceInterface) {
    this.invoiceService = invoiceServiceInterface;
  }

  public void createInvoice(){

    System.out.println("use scanner");
    Invoice invoice = new Invoice();
    invoice.setCustomerName("Virgin galactic");
    invoiceService.creatInvoice(invoice);

  }

}
