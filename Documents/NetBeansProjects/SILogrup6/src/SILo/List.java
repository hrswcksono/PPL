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
@SuppressWarnings("serial")
public class List extends DefaultTableModel {
    
    public static Object[] TABLE_HEADER ;
 
    public static Object[][] DATA ; 
    
    public List() {
         super(DATA, TABLE_HEADER);
    }
    
    
}
