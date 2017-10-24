/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhongTro;

/**
 *
 * @author nhattruong
 */
public class PhongTroDAO {
    public ArrayList<PhongTro> getListPhongTro() throws SQLException{
        Connection conn = DBConnect.getConnection();
        String sql = "select * from phongtro";
        PreparedStatement ps = conn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<PhongTro> list = new ArrayList<>();
        while(rs.next()){
            PhongTro phongtro = new PhongTro();
            phongtro.setId(rs.getInt("id"));
            phongtro.setTitle(rs.getString("title"));
            phongtro.setContent(rs.getString("content"));
            phongtro.setArea(rs.getString("area"));
            phongtro.setPrice(rs.getLong("price"));
            phongtro.setImage(rs.getString("image"));
            phongtro.setEmail(rs.getString("email"));
            phongtro.setPhone(rs.getString("phone"));
            phongtro.setAddress(rs.getString("address"));
            list.add(phongtro);
        }
        return list;
    }
    
    public PhongTro getPhongTroById(int id) throws SQLException{
        Connection conn = DBConnect.getConnection();
        String sql = "SELECT * FROM phongtro WHERE id = '" + id + "'";
        PreparedStatement ps = conn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        PhongTro phongtro = new PhongTro();
        while(rs.next()){
            phongtro.setId(rs.getInt("id"));
            phongtro.setTitle(rs.getString("title"));
            phongtro.setContent(rs.getString("content"));
            phongtro.setArea(rs.getString("area"));
            phongtro.setPrice(rs.getLong("price"));
            phongtro.setImage(rs.getString("image"));
            phongtro.setEmail(rs.getString("email"));
            phongtro.setPhone(rs.getString("phone"));
            phongtro.setAddress(rs.getString("address"));
        }
        return phongtro;
    }
    
    public ArrayList<PhongTro> getListPhongTroByNav(String area, int rangePrice, int firstResult, int maxResult) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql="";
        long priceStart = 0, priceEnd = 0;
        
        if (area.equalsIgnoreCase("tatca")) area = "";
        
        if (rangePrice < 8){
             priceStart = (rangePrice - 1) *1000000;
            priceEnd = rangePrice * 1000000;
        } 
        
        if(area.length() == 0 ){
            if (rangePrice == 8){
                sql = "SELECT * FROM phongtro WHERE price >= '7000000'";
            }else {
                if (priceStart ==0 && priceEnd == 0){
                sql = "SELECT * FROM phongtro";
                } else{
                    if (priceStart == 0){
                        sql = "SELECT * FROM phongtro WHERE price <= '" + priceEnd + "'";
                    } else {
                        if (rangePrice == 8){
                            sql = "SELECT * FROM phongtro WHERE price >= '" + priceEnd + "'";
                        } else{
                            sql = "SELECT * FROM phongtro WHERE price >= '" + priceStart + "' AND price <= '" + priceEnd + "'";
                        }
                    }
                }
            }
        } else {
            if (rangePrice == 8){
                sql = "SELECT * FROM phongtro WHERE area = '" + area + 
                        "' AND price >= '" + 7000000 + "'";
            } else {
                if ( priceStart == 0 && priceEnd == 0){
                sql = "SELECT * FROM phongtro WHERE area = '" + area + "'";
                } else {
                    if(priceStart == 0){
                        sql = "SELECT * FROM phongtro WHERE area = '" + area +
                            "' AND price <= '" + priceEnd + "'";
                    } else {
                        sql = "SELECT * FROM phongtro WHERE area = '" + area +
                            "' AND price >= '" + priceStart + "' AND price <= '" + priceEnd + "'";
                    }
                 }
            }
            
        } 
        
        sql += " limit ?, ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, firstResult);
        ps.setInt(2, maxResult);
        ResultSet rs = ps.executeQuery();
        ArrayList<PhongTro> list = new ArrayList<>();
        while (rs.next()) {
            PhongTro phongTro = new PhongTro();
            phongTro.setId(rs.getInt("id"));
            phongTro.setTitle(rs.getString("title"));
            phongTro.setContent(rs.getString("content"));
            phongTro.setArea(rs.getString("area"));
            phongTro.setPrice(rs.getLong("price"));
            phongTro.setImage(rs.getString("image"));
            phongTro.setEmail(rs.getString("email"));
            phongTro.setPhone(rs.getString("phone"));
            phongTro.setAddress(rs.getString("address"));
            list.add(phongTro);
        }
        return list;
    }
    
    public int countPhongTroByFilter(String area,int rangePrice) throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "";
        
        long priceStart = 0, priceEnd = 0;
        
        if (area.equalsIgnoreCase("tatca")) area = "";
        
        if (rangePrice < 8){
             priceStart = (rangePrice - 1) *1000000;
            priceEnd = rangePrice * 1000000;
        } 
        
        if(area.length() == 0 ){
            if (priceStart ==0 && priceEnd == 0){
                sql = "SELECT * FROM phongtro";
            } else{
                if (priceStart == 0){
                    sql = "SELECT * FROM phongtro WHERE price <= '" + priceEnd + "'";
                } else {
                    if (rangePrice == 8){
                        sql = "SELECT * FROM phongtro WHERE price >= '" + priceEnd + "'";
                    } else{
                        sql = "SELECT * FROM phongtro WHERE price >= '" + priceStart + "' AND price <= '" + priceEnd + "'";
                    }
                }
            }
        } else {
            if (rangePrice == 8){
                sql = "SELECT * FROM phongtro WHERE area = '" + area + 
                        "' AND price >= '" + 7000000 + "'";
            } else {
                if ( priceStart == 0 && priceEnd == 0){
                 sql = "SELECT * FROM phongtro WHERE area = '" + area + "'";
                } else {
                    if(priceStart == 0){
                    sql = "SELECT * FROM phongtro WHERE area = '" + area +
                        "' AND price <= '" + priceEnd + "'";
                    } else {
                   
                        sql = "SELECT * FROM phongtro WHERE area = '" + area +
                        "' AND price >= '" + priceStart + "' AND price <= '" + priceEnd + "'";
                     }
                }
            }
            
        } 
        
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        PhongTro phongtro = new PhongTro();
        while (rs.next()) {
            count+=1;
        }
        return count;
    }
    
    public static void main(String[] args) throws SQLException {
        PhongTroDAO dao = new PhongTroDAO();
//        for(PhongTro item : dao.getListPhongTro()){
//            System.out.println(item.getId() + "-" + item.getTitle());
//        }

        System.out.println(dao.countPhongTroByFilter("quan1",8));
    }
}
