package com.mycompany.invoise.controller;

import java.util.Scanner;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

  private InvoiceServiceInterface invoiceService;


  public InvoiceServiceInterface getInvoiceService() {
    return invoiceService;
  }


  public void setInvoiceService(InvoiceServiceInterface invoiceService) {
    this.invoiceService = invoiceService;
  }


  public void createInvoice(){

     System.out.println( "what is the customer name ? " );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.creatInvoice(invoice);

  }

}
