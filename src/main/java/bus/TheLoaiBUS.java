package bus;

import dao.TheLoaiDAO;
import dto.TheLoai;
import java.util.ArrayList;

public class TheLoaiBUS {
    TheLoaiDAO theloaiDAO = new TheLoaiDAO();
    public ArrayList<TheLoai> getAll()
    {
       return theloaiDAO.getAll();
    }    
    public int Insert(TheLoai tl)
    {
       return theloaiDAO.Insert(tl);
    }    
    public int Update(TheLoai tl)
    {
       return theloaiDAO.Update(tl);
    }
    public int Delete(int id)
    {
       return theloaiDAO.Delete(id);
    }    
}
