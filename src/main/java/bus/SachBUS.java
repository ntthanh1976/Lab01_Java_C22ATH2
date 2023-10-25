/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import dao.SachDAO;
import dto.Sach;
import java.util.ArrayList;

public class SachBUS {
    SachDAO sachDAO = new SachDAO();
    
    public ArrayList<Sach> getAll()
    {
       return sachDAO.getAll();
    }   
    
    public Sach findById(int id)
    {
      return sachDAO.findById(id);
    }
    public int Insert(Sach s)
    {
       return sachDAO.Insert(s);
    }    
    public int Update(Sach s)
    {
       return sachDAO.Update(s);
    }
    public int Delete(int id)
    {
       return sachDAO.Delete(id);
    }               
}
