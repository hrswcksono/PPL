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
public class ItemCtl {
    
    public void onSearchClicked(String keyword){
        items[] item = dbhandler.searchItem(keyword);
    }
    
    private DbHandler dbhandler;
}
