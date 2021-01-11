/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILo;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author USER
 */
public class Menu extends JMenuBar {
    JMenu menu;
    JMenuItem createDeliveryNote;
    JMenuItem showItems;
    JMenuItem showInvoices;
    JMenuItem showDeliveryNote;

    public Menu() {
        menu = new JMenu("Options");
        createDeliveryNote = new JMenuItem("Create Delivery Note");
        showItems = new JMenuItem("Show Items");
        showInvoices = new JMenuItem("Show Invoices");
        showDeliveryNote = new JMenuItem("Show Delivery Note");
        menu.add(createDeliveryNote);  
        menu.add(showItems);
        menu.add(showInvoices);
        menu.add(showDeliveryNote);
        this.add(menu);   
    }
}
