/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.District;

/**
 *
 * @author nhattruong
 */
public class DistrictDAO {
    public List<District> getListDistrict(){
        List<District> list = new ArrayList<>();
        list.add(new District("tatca","Tất cả"));
        list.add(new District("quan1","Quận 1"));
        list.add(new District("quan2","Quận 2"));
        list.add(new District("quan3","Quận 3"));
        list.add(new District("quan4","Quận 4"));
        list.add(new District("quan5","Quận 5"));
        list.add(new District("quan6","Quận 6"));
        list.add(new District("quan7","Quận 7"));
        list.add(new District("quan8","Quận 8"));
        list.add(new District("quan9","Quận 9"));
        list.add(new District("quan10","Quận 10"));
        list.add(new District("quan11","Quận 11"));
        list.add(new District("quan12","Quận 12"));
        list.add(new District("binhtan","Quận Bình Tân"));
        list.add(new District("binhthanh","Quận Bình Thạnh"));
        list.add(new District("govap","Quận Gò Vấp"));
        list.add(new District("phunhuan","Quận Phú Nhuận"));
        list.add(new District("tanbinh","Quận Tân Bình"));
        list.add(new District("tanphu","Quận Tân Phú"));
        list.add(new District("thuduc","Quận Thủ Đức"));
        list.add(new District("binhchanh","Huyện Bình Chánh"));
        list.add(new District("cangio","Huyện Cần Giờ"));
        list.add(new District("cuchi","Huyện Củ Chi"));
        list.add(new District("hocmon","Huyện Hóc Môn"));
        list.add(new District("nhabe","Huyện Nhà Bè"));
        
        return list;
    }
    
    public static void main(String[] args) {
        DistrictDAO huyen = new DistrictDAO();
        for(District item : huyen.getListDistrict()){
            System.out.println(item.getValue() + " - " + item.getName());
        }
    }
}
