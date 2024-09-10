package com.mycompany.invoise;

import java.util.Scanner;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceMichelController;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dans quel configuration êtes-vous? ");
        int configuration = sc.nextInt();
        if(configuration == 1){
          InvoiceController invoiceController = new InvoiceController();
          invoiceController.creatInvoiceUsingConsole();
        }
        else if(configuration == 2){
          InvoiceMichelController invoiceMichelController = new InvoiceMichelController();
          invoiceMichelController.createControllerUsingWeb();
        }
    }
}
