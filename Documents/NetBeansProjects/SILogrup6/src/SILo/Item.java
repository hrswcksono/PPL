/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILo;

/**
 *
 * @author USER
 */
public class Item {
    public Integer id;
    public String barcode;
    public String title;
    public String description;
    public Integer numberOfStock;
    public String manufacturer;
    public String url;

    public Item(Integer id, String barcode, String title, String description, Integer numberOfStock, String manufacturer, String url) {
        this.id = id;
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.numberOfStock = numberOfStock;
        this.manufacturer = manufacturer;
        this.url = url;
    }

   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfStock() {
        return numberOfStock;
    }

    public void setNumberOfStock(Integer numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", barcode=" + barcode + ", title=" + title + ", description=" + description + ", numberOfStock=" + numberOfStock + ", manufacturer=" + manufacturer + ", url=" + url + '}';
    }
    
    
}
