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
    
    //Lihat Daftar Item
    public void searchItemList(){
        
    }
    
    public String[] 
    
    public void onSearchClicked(String keyword){
//        Item[] item = dbhandler.searchItem(keyword);
        String[] item = dbh.searchItem(keyword);
        
        Item[] itemlist = createItems(results);
        
    }
    
    public void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.addRow(dataRow);
    }
    
    private Item[] createItems(String[] results){
        
        return null;
        
    }
    
    
    
    public ItemForm iform;
    private DbHandler dbh;
    private NewItemForm nif;
}
