package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;

public class InvoiceService {

  private static Long lastNumber=0L;

  public InvoiceRepository invoiceRepository = new InvoiceRepository();

  public void creatInvoice(Invoice invoice){
    invoice.setNumber(String.valueOf(++lastNumber));
    invoiceRepository.create(invoice);
  }

}
