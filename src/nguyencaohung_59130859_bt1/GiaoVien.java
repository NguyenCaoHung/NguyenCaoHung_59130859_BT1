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
    public class GiaoVien extends CaNhan
    {
    
    private String monDay;
    private String toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
    super(hoTen, tuoi, diaChi, sdt);
    this.monDay = monDay;
    this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() 
    {
    return super.hienThiTT()+"\n"+"Môn Dạy:"+monDay+"\n"+"Tổ Bộ Môn:"+toBoMon+"\n"; 
    }
    
}