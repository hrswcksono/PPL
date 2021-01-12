/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ItemCtl {
    
    public ItemCtl() {
        
    }
    
    public void initAdd(){
        addNewItem(new Object[]{
            nif.getIdTF().getText(),
            nif.getBarcodeTF().getText(),
            nif.getTitleTF().getText(),
            nif.getDescriptionTF().getText(),
            nif.getNumberOfStockTF().getText(),
            nif.getManufacturerTF().getText(),
            nif.getUrlTF().getText()
        });
//        nif.getSubmitbtn().addActionListener(e -> createItems());
    }
    
    //Lihat Daftar Item
    public void searchItemList(){
        
    }
    
    public static void addNewItem(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)ItemForm.getjTable1().getModel();
        model.addRow(dataRow);
    }
    
    public void showRefresedItemList(){
        
    }
    
    private void createItems(){
        it.setId(Integer.parseInt(nif.getIdTF().getText()));
        it.setBarcode(nif.getBarcodeTF().getText());
        it.setTitle(nif.getTitleTF().getText());
        it.setDescription(nif.getDescriptionTF().getText());
        it.setNumberOfStock(Integer.parseInt(nif.getNumberOfStockTF().getText()));
        it.setManufacturer(nif.getManufacturerTF().getText());
        it.setUrl(nif.getUrlTF().getText());
    }
    
    private Item it;
    private ItemForm iform;
    private DbHandler dbh;
    private NewItemForm nif;
}
