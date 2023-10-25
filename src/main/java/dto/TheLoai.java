package dto;
public class TheLoai {
    private int id;
    private String tentheloai;

    public TheLoai() {
    }

    public TheLoai(int id) {
        this.id = id;
    }

    public TheLoai(int id, String tentheloai) {
        this.id = id;
        this.tentheloai = tentheloai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    @Override
    public String toString() {
        return  id+ " - "+ tentheloai;
    }

    @Override
    public boolean equals(Object obj) {
        final TheLoai other = (TheLoai) obj;
        return this.id == other.id;
    } 
    
  
       
}
