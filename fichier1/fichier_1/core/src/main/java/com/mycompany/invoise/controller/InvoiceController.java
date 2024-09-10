package com.mycompany.invoise.controller;

import java.util.Scanner;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;

public class InvoiceController {

  public void creatInvoiceUsingConsole(){

     System.out.println( "what is the customer name ? " );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.creatInvoice(invoice);

  }

}
