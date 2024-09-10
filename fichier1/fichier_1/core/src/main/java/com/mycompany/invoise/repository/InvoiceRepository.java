package com.mycompany.invoise.repository;

import java.util.List;
import java.util.ArrayList;

import com.mycompany.invoise.entity.Invoice;

public class InvoiceRepository {

  private static List<Invoice> invoices = new ArrayList<>();

  public void create(Invoice invoice){

    invoices.add(invoice);
    System.out.println("La facture numéro " + invoice.getNumber() + " a bien été ajouté pour " + invoice.getCustomerName());

  }

}
