/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import SILo.Item;
import SILo.ItemCtl;
import SILo.ItemForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class DbHandler {
    
//    ItemForm itemform;
    ItemCtl ictl;
    
    public String[] searchItem(String keyword) {
        return null;
    }
    
    public void showItem(){
        
    }
    
    public void addItem(Item item) {
		try {
			Connection conn = new koneksi().getConn();
			    
			String sql = "INSERT INTO Item(`id`,`barcode`, `title`,`description`, `numberOfStocks`, `manufacturer`, `url`)"
						+ "VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,item.getId());
			ps.setString(2, item.getBarcode());
			ps.setString(3, item.getTitle());
			ps.setString(4, item.getDescription());
                        ps.setInt(5,item.getNumberOfStock());
			ps.setString(6 ,item.getManufacturer());
			ps.setString(7,item.getUrl());
			
			ps.executeUpdate();
			conn.close();
						
		} catch(Exception e) {
			 System.out.println(e);	}
	}
    
    
    	/* Get All Item */
	public List<Item> getAllItem() {
		List<Item> items = new ArrayList<Item>();
		try {
			Connection conn = new koneksi().getConn();
			    
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from item");
			
			while(rs.next()){
				Item temp = new Item(rs.getInt("id"), rs.getString("barcode"), rs.getString("title"), rs.getString("description"), rs.getInt("numberOfStock"),
						rs.getString("manufacturer"), rs.getString("url") ); 
				items.add(temp);
			}
			conn.close();
			
		} catch(Exception e) {
			 System.out.println(e);	}
			    
	    return items;
	}
    
        
        public void EditItem(Item item) {
		try {
			Connection conn = new koneksi().getConn();
			
			String sql = "UPDATE ITEM SET barcode = ?, title = ?, description = ?, manufacturer = ?, url = ?, stocks = ?  WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(7, item.getId());
			ps.setString(1, item.getBarcode());
			ps.setString(2, item.getTitle());
			ps.setString(3, item.getDescription());
                        ps.setInt(4, item.getNumberOfStock());
			ps.setString(5, item.getManufacturer());
			ps.setString(6, item.getUrl());
			ps.executeUpdate();
			conn.close();
			
		}	catch(Exception e) {
			 System.out.println(e);	}
		
	}
    
    private Item item;
    
//    public void tampilData(String where) {
//    try {
//        st = cn.createStatement();
//        tabModel.getDataVector().removeAllElements();
//        tabModel.fireTableDataChanged();
//        rs = st.executeQuery("SELECT * FROM students " + where);
//    
//    while (rs.next()) {
//      Object[] data = {
//        rs.getString("nis"),
//        rs.getString("nama"),
//        rs.getString("jurusan"),
//        rs.getString("jk"),
//        rs.getString("alamat"),
//      };
//        
//        tabModel.addRow(data);
//    }
//  } catch(Exception e) {
//    e.printStackTrace();
//  }
//}
}
