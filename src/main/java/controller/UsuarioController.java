
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.ConnectionFactory;

public class UsuarioController
{
    public int Login(int id, int senha)
    {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet; // Guarda o retorno do banco de dados
        
        int Sucesso = 1;

        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, id);
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                int SenhaDB = resultSet.getInt("senha");
                if(senha == SenhaDB)
                {
                    Sucesso = 0;
                }
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar o usuário " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        } 
        return Sucesso;
    }
}
