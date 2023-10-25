package dto;

public class Sach {
    private int id;
    private String tieude;
    private String tacgia;
    private double giaban;
    private int  idtheloai;

    public Sach() {
    }

    public Sach(int id) {
        this.id = id;
    }

    public Sach(int id, String tieude, String tacgia, double giaban, int idtheloai) {
        this.id = id;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.giaban = giaban;
        this.idtheloai = idtheloai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getIdtheloai() {
        return idtheloai;
    }

    public void setIdtheloai(int idtheloai) {
        this.idtheloai = idtheloai;
    }

    @Override
    public String toString() {
        return "Sach{" + "id=" + id + ", tieude=" + tieude + ", tacgia=" + tacgia + ", giaban=" + giaban + ", idtheloai=" + idtheloai + '}';
    }     
}
