package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface {

  private static Long lastNumber=0L;

  public InvoiceRepositoryInterface invoiceRepository;

  public void creatInvoice(Invoice invoice){
    invoice.setNumber(String.valueOf(++lastNumber));
    invoiceRepository.create(invoice);
  }

}
