/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyencaohung_59130859_bt1;

/**
 *
 * @author PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LopHoc lopHoc = new LopHoc();
        HocSinh hocSinh1 = new HocSinh("11A", "Nấu Ăn", "Lê Anh Tú", 17, "Cao Bá Quát", "0935988678");
        HocSinh hocSinh2 = new HocSinh("12A", "Ukulele", "Lê Anh Tuấn", 18, "Nguyễn Trãi", "0945234276");
        GiaoVien giaovien1 = new GiaoVien("Lịch Sử", "Khoa Lịch Sử", "Hồ Thanh Thái", 29, "06 Nguyễn Đình Chiểu", "018843465");
        GiaoVien giaovien2 = new GiaoVien("Địa Lý", "Khoa Địa lý", "Hồ Trúc An", 30, "07 Lạc Long Quân", "845672340");
        
        lopHoc.themHocSinh(hocSinh1);
        lopHoc.themHocSinh(hocSinh2);
        lopHoc.themGVGD(giaovien1);
        lopHoc.themGVGD(giaovien2);
        
        lopHoc.inDSHS();
        lopHoc.inDSGVGD();
    }
    
}
