/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

//criando a class CarroDAO
public class CarroDAO {

    // criando a variavel con do tipo Connection
    private Connection con;

    public CarroDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
//Criando o metodo inserir
    public String inserir(CarroBean carro) {
        String sql = "insert into carro(placa,cor,descricao,modelo,marca,conversivel,janelas,portas,rodas,4x4,porte,blindado)values(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            ps.setString(4, carro.getModelo());
            ps.setString(5, carro.getMarca());
            ps.setString(6, carro.getConversivel());
            ps.setString(7, carro.getJanelas());
            ps.setString(8, carro.getPortas());
            ps.setString(9, carro.getRodas());
            ps.setString(10, carro.getTracao());
            ps.setString(11, carro.getPorte());
            ps.setString(12, carro.getBlindado());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    // criando o metodo alterar
    public String alterar(CarroBean carro){
        String sql = "update carro set cor = ?,descricao = ?,modelo = ?, marca = ?, conversivel = ?,janelas = ?, portas = ?, rodas = ?, 4x4 = ?, porte = ?, blindado = ?";
        sql += " where placa = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getModelo());
            ps.setString(4, carro.getMarca());
            ps.setString(5, carro.getConversivel());
            ps.setString(6, carro.getJanelas());
            ps.setString(7, carro.getPortas());
            ps.setString(8, carro.getRodas());
            ps.setString(9, carro.getTracao());
            ps.setString(10, carro.getPorte());
            ps.setString(11, carro.getBlindado());
            ps.setString(12, carro.getPlaca());
            
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch(SQLException e) {
                    return e.getMessage();
                    }
    }
    // criando o metodo excluir
    public String excluir(CarroBean carro){
        String sql = "delete from carro where placa = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            
            if(ps.executeUpdate() > 0){
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch(SQLException e) {
            return e.getMessage();
        }
    }
    //criando o metodo listarTodos
    public List<CarroBean> listarTodos(){
        String sql = "select * from carro";
        
        List<CarroBean> listaCarro = new ArrayList<CarroBean>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null) {
                while(rs.next()){
                    CarroBean cb = new CarroBean();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));
                    cb.setModelo(rs.getString(4));
                    cb.setMarca(rs.getString(5));
                    cb.setConversivel(rs.getString(6));
                    cb.setJanelas(rs.getString(7));
                    cb.setPortas(rs.getString(8));
                    cb.setRodas(rs.getString(9));
                    cb.setTracao(rs.getString(10));
                    cb.setPorte(rs.getString(11));
                    cb.setBlindado(rs.getString(12));
                    listaCarro.add(cb);
                }
                    return listaCarro;
            } else {
                return null;
            }
        } catch(SQLException e) {
            return null;
        }
    }

}

