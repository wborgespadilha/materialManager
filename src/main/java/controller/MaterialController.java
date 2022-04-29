
package controller;

import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.time.Instant;
import java.util.List;

import model.Material;

import util.ConnectionFactory;

public class MaterialController
{
    public void SaveMaterial(Material material)
    {
        String sql = "INSERT INTO materiais (material,imagem,descricao,ativo,data) "
                + "VALUES (?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, material.getMaterial());//Define os parâmetros
            statement.setBlob(2, material.getImagem());
            statement.setString(3, material.getDescricao());
            statement.setBoolean(4, material.isAtivo());
            Timestamp sqldate = Timestamp.from(Instant.now());
            statement.setTimestamp(5, sqldate);
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao cadastrar o material " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public List<Material> getAllMateriais()
    {
        String sql = "SELECT * FROM materiais";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
       
        List<Material> materiais = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Material material = new Material();
                material.setID(resultSet.getInt("idmateriais"));//Pega todos os dados
                material.setMaterial(resultSet.getString("material"));
                material.setImagem(resultSet.getBlob("imagem"));
                material.setDescricao(resultSet.getString("descricao"));
                material.setAtivo(resultSet.getBoolean("ativo"));
                material.setData(resultSet.getTimestamp("data"));
                materiais.add(material);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os materiais " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }
        return materiais;
    }
    
    public void DeleteMaterial(int materialid)
    {
        String sql = "DELETE FROM materiais WHERE idmateriais = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, materialid);//Muda o ? para o id do material
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o material " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }  
    }
}
