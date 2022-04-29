
package model;

import java.sql.Timestamp;

public class Comentario
{
    int ID;
    String comentario;
    int IdMaterial;
    int IdUsuario;
    Timestamp data;
    
    public Comentario(int ID, String comentario, int IdMaterial, int IdUsuario, Timestamp data)
    {
        this.ID = ID;
        this.comentario = comentario;
        this.IdMaterial = IdMaterial;
        this.IdUsuario = IdUsuario;
        this.data = data;
    }
    
    public Comentario()
    {
        this.ID = -1;
        this.comentario = null;
        this.IdMaterial = -1;
        this.IdUsuario = -1;
        this.data = null;
    }

    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public String getComentario()
    {
        return comentario;
    }
    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }
    public int getIdMaterial()
    {
        return IdMaterial;
    }
    public void setIdMaterial(int IdMaterial)
    {
        this.IdMaterial = IdMaterial;
    }
    public int getIdUsuario()
    {
        return IdUsuario;
    }
    public void setIdUsuario(int IdUsuario)
    {
        this.IdUsuario = IdUsuario;
    }
    public Timestamp getData()
    {
        return data;
    }
    public void setData(Timestamp data)
    {
        this.data = data;
    }
    
}
