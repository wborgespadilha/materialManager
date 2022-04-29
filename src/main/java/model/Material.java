
package model;

import java.sql.Blob;
import java.sql.Timestamp;

public class Material
{
    int ID;
    String material;
    String descricao;
    Blob imagem;
    boolean ativo;
    Timestamp data;
    
    public Material(int ID, String material, String descricao, boolean ativo, Timestamp data)
    {
        this.ID = ID;
        this.material = material;
        this.descricao = descricao;
        this.ativo = ativo;
        this.data = data;
    }
    
    public Material()
    {
        this.ID = -1;
        this.material = null;
        this.descricao = null;
        this.ativo = false;
        this.data = null;
    }
    
    public Blob getImagem()
    {
        return imagem;
    }
    public void setImagem(Blob imagem)
    {
        this.imagem = imagem;
    }
    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public String getMaterial()
    {
        return material;
    }
    public void setMaterial(String material)
    {
        this.material = material;
    }
    public String getDescricao()
    {
        return descricao;
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public boolean isAtivo()
    {
        return ativo;
    }
    public void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
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
