package com.mycompany.invoise;

import java.util.Scanner;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceMichelController;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceInterface;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        InvoiceRepositoryInterface invoiceRepository = new InvoiceRepository();
        InvoiceServiceInterface invoiceService = new InvoiceService(invoiceRepository);

        System.out.println("Dans quel configuration êtes-vous? ");
        int configuration = sc.nextInt();
        if(configuration == 1){
          InvoiceController invoiceController = new InvoiceController(invoiceService);
          invoiceController.createInvoice();
        }
        else if(configuration == 2){
          InvoiceMichelController invoiceMichelController = new InvoiceMichelController(invoiceService);
          invoiceMichelController.createInvoice();
        }
    }
}
