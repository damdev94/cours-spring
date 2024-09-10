package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryMichel;

public class InvoiceServiceMichel {

  private static Long lastNumber=112L;

  public InvoiceRepositoryMichel invoiceRepository = new InvoiceRepositoryMichel();

  public void creatInvoice(Invoice invoice){
    invoice.setNumber(String.valueOf("INV" + ++lastNumber));
    invoiceRepository.create(invoice);
  }

}
