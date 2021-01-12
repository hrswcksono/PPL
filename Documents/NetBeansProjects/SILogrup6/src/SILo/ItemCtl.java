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
    
    public void onSearchClicked(String keyword){
//        items[] item = dbhandler.searchItem(keyword);
        String[] item = dbh.searchItem(keyword);
        
        items[] itemlist = createItems(results);
        
    }
    
    public void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.addRow(dataRow);
    }
    
    private items[] createItems(String[] results){
        
        return null;
        
    }
    
    private DbHandler dbh;
    private NewItemForm nif;
}
