package dao;

import context.DbContext;
import dto.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SachDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    //phuong thuc doc tat ca sach tu table Sach
    public ArrayList<Sach> getAll() {
        ArrayList<Sach> ds = new ArrayList<>();
        String sql = "select * from sach";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new Sach(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDouble(4), rs.getInt(5)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    //phuong thuc doc tat ca sach tu table Sach

    public Sach findById(int id) {
        Sach kq = null;
        //câu truy vấn  sql sử dụng tham số 
        String sql = "select * from sach where id=?";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            //truyền tham số cho câu sql
            ps.setInt(1, id);
            //thực thi truy vấn
            rs = ps.executeQuery();
            if (rs.next())// có tồn tại
            {
                kq = new Sach(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return kq;
    }

    //----phuong thuc thêm đối tượng sach vào table Sach
    public int Insert(Sach obj) {
        String sql = "insert into sach (tieude,tacgia,giaban,idtheloai) values (?,?,?,?)";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            //truyền giá trị cho tham số trong câu sql
            ps.setString(1, obj.getTieude());
            ps.setString(2, obj.getTacgia());
            ps.setDouble(3, obj.getGiaban());
            ps.setInt(4, obj.getIdtheloai());
            return ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return 0;
    }
    //----phuong thuc cập nhật đối tượng sach vào table Sach

    public int Update(Sach obj) {
        String sql = "update sach set tieude=?,tacgia=?,giaban=?,idtheloai=? where id=?";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            //truyền giá trị cho tham số trong câu sql
            ps.setString(1, obj.getTieude());
            ps.setString(2, obj.getTacgia());
            ps.setDouble(3, obj.getGiaban());
            ps.setInt(4, obj.getIdtheloai());
            ps.setInt(5, obj.getId());
            return ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return 0;
    }

    public int Delete(int id) {
        String sql = "delete from sach where id=?";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            //truyền giá trị cho tham số trong câu sql        
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return 0;
    }
}
