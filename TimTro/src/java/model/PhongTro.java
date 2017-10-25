/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nhattruong
 */
public class PhongTro {
    private int id;
    private String title;
    private String content;
    private String area;
    private String image;
    private long price;
    private String email;
    private String phone;
    private String address;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        if (title == null) return "";
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        if(content == null) return "";
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getSubContent(){
        if(content == null) return "";
        if (content.length() > 100){
            return content.substring(0, 100) + "...";
        }
        return content;
    }

    public String getArea() {
        if (area == null){
            return "";
        }
        return getKhuVuc(area);
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getImage() {
        if (image == null) return "";
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getEmail() {
        if (email == null) return "";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        if(phone == null) return "";
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        if (address == null) return "";  
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    public String getKhuVuc(String khuvuc){
        switch(khuvuc){
            case "quan1": return "Quận 1";
            case "quan2": return "Quận 2";
            case "quan3": return "Quận 3";
            case "quan4": return "Quận 4";
            case "quan5": return "Quận 5";
            case "quan6": return "Quận 6";
            case "quan7": return "Quận 7";
            case "quan8": return "Quận 8";
            case "quan9": return "Quận 9";
            case "quan10": return "Quận 10";
            case "quan11": return "Quận 11";
            case "quan12": return "Quận 12";
            case "binhthanh": return "Bình Thạnh";
            case "phunhuan": return "Phú Nhuận";
            case "govap": return "Gò Vấp";
            case "tanbinh": return "Tân Bình";
            case "tanphu": return "Tân Phú";
            case "binhtan": return "Bình Tân";
            case "thuduc": return "Thủ Đức";
            case "hocmon": return "Hóc Môn";
            case "nhabe": return "Nhà Bè";
        }
        return "";
    }
}
