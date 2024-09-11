package com.mycompany.invoise.controller;

import java.util.Scanner;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceController implements InvoiceControllerInterface {

  private InvoiceServiceInterface invoiceServiceInterface;

  public void createInvoice(){

     System.out.println( "what is the customer name ? " );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.creatInvoice(invoice);

  }

}
