package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product book = new Product("Thinking in Java");
        Product phone = new Product("IPhone 5");
        Product computer = new Product("Lenovo Yoga");

        Item firstItem = new Item(2, book, new BigDecimal(35));
        Item secondItem = new Item(1, phone, new BigDecimal(1299));
        Item thirdItem = new Item(1, computer, new BigDecimal(2999));

        List<Item> itemsList = new ArrayList<>();
        itemsList.add(firstItem);
        itemsList.add(secondItem);
        itemsList.add(thirdItem);

        Invoice invoice = new Invoice("01/01/2018", itemsList);
        invoice.setItems(itemsList);
        firstItem.setInvoice(invoice);
        secondItem.setInvoice(invoice);
        thirdItem.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        try {
            invoiceDao.delete(id);
        } catch(Exception e) {
            //do nothing
        }
    }
}
