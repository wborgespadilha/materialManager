
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import java.time.Instant;

import java.util.ArrayList;
import java.util.List;

import model.Comentario;

import util.ConnectionFactory;

public class ComentarioController
{
    public void SaveComentario(Comentario comentario)
    {
        String sql = "INSERT INTO comentarios (comentario,idmaterial,idusuario,data) "
                + "VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, comentario.getComentario());//Define os parâmetros
            statement.setInt(2, comentario.getIdMaterial());
            statement.setInt(3, comentario.getIdUsuario());
            Timestamp sqldate = Timestamp.from(Instant.now());
            statement.setTimestamp(4, sqldate);
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao cadastrar o comentario " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public List<Comentario> getComentarios(int idmaterial)
    {
        String sql = "SELECT * FROM comentarios WHERE idmaterial = ? ";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
       
        List<Comentario> comentarios = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, idmaterial);
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Comentario comentario = new Comentario();
                comentario.setID(resultSet.getInt("idcomentarios"));//Pega todos os dados
                comentario.setComentario(resultSet.getString("comentario"));
                comentario.setIdMaterial(resultSet.getInt("idmaterial"));
                comentario.setIdUsuario(resultSet.getInt("idusuario"));
                comentario.setData(resultSet.getTimestamp("data"));
                comentarios.add(comentario);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os comentarios " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }
        return comentarios;
    }
    
    public void DeleteComentario(Comentario comentario)
    {
        String sql = "DELETE FROM comentarios WHERE idcomentarios = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, comentario.getID());//Muda o ? para o id do material
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o comentário " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }  
    }
    
}
