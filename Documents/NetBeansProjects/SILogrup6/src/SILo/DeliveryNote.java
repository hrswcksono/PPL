/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class DeliveryNote {
    private Integer deliveryNoteNumber;
    private Integer invoiceNumber;
    private String customerName;
    private Date orderDate;
    private Date deliveryDate;
    private String status;

    public DeliveryNote(Integer deliveryNoteNumber, Integer invoiceNumber, String customerName, Date orderDate, Date deliveryDate, String status) {
        this.deliveryNoteNumber = deliveryNoteNumber;
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    public void setDeliveryNoteNumber(Integer deliveryNoteNumber) {
        this.deliveryNoteNumber = deliveryNoteNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliveryNote{" + "deliveryNoteNumber=" + deliveryNoteNumber + ", invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status + '}';
    }
    
}
