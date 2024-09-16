package com.mycompany.invoise.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;


public class InvoiceServicePrefix implements InvoiceServiceInterface{

  @Autowired

    private long lastNumber;
    private String prefix;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(prefix+(++lastNumber));
        invoiceRepository.create(invoice);
    }

    public long getLastNumber() {
      return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
      this.lastNumber = lastNumber;
    }

    public String getPrefix() {
      return prefix;
    }

    public void setPrefix(String prefix) {
      this.prefix = prefix;
    }


}
