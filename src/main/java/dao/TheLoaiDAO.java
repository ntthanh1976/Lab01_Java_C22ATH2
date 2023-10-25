package dao;

import context.DbContext;
import dto.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TheLoaiDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    //phuong thuc doc (select) tat ca the loai
    public ArrayList<TheLoai>  getAll()
    {
        ArrayList<TheLoai> ds = new ArrayList<>();
        String sql = "select * from theloai";
        conn = new DbContext().getConnection();
        try{         
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
              ds.add( new TheLoai(rs.getInt(1), rs.getString(2)));
           }
        }catch(Exception ex){
            System.out.println("Loi:" + ex.toString());
        } 
        return ds;
    }
    
    //phuong thuc them (insert)  the loai
    public int Insert (TheLoai tl)
    {
        String sql = "insert into theloai (tentheloai) values (?)";
        conn = new DbContext().getConnection();
       try{ 
         ps= conn.prepareStatement(sql);
         ps.setString(1, tl.getTentheloai());
         return ps.executeUpdate();
       }catch(Exception ex){
           System.out.println("Loi:" + ex.toString());
       }
       return 0;        
    }   
    //phuong thuc cap nhat (update) the loai
    public int Update (TheLoai tl)
    {
       String sql = "update theloai set tentheloai=? where id=?";
       conn = new DbContext().getConnection();
       try{ 
         ps= conn.prepareStatement(sql);
          //truyền tham số cho câu sql
          ps.setString(1, tl.getTentheloai());
          ps.setInt(2, tl.getId());         
         return ps.executeUpdate();
       }catch(Exception ex){
           System.out.println("Loi:" + ex.toString());
       }
       return 0;        
    }
    //phuong thuc xoa (delete) the loai
    public int Delete (int id)
    {
       String sql = "delete from theloai where id=?";
       conn = new DbContext().getConnection();
       try{ 
         ps= conn.prepareStatement(sql);
          //truyền tham số cho câu sql       
          ps.setInt(1, id);         
         return ps.executeUpdate();
       }catch(Exception ex){
           System.out.println("Loi:" + ex.toString());
       }
       return 0;        
    }
}
