package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface{

  private static Long lastNumber=112L;

  public InvoiceRepositoryInterface invoiceRepository;

  public void creatInvoice(Invoice invoice){
    invoice.setNumber(String.valueOf("INV" + ++lastNumber));
    invoiceRepository.create(invoice);
  }

}
