package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceNumber implements InvoiceServiceInterface {

  private static Long lastNumber=0L;

  public InvoiceRepositoryInterface invoiceRepository;

  public InvoiceRepositoryInterface getInvoiceRepository() {
    return invoiceRepository;
  }

  public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
    this.invoiceRepository = invoiceRepository;
  }

  public void creatInvoice(Invoice invoice){
    invoice.setNumber(String.valueOf(++lastNumber));
    invoiceRepository.create(invoice);
  }

}
