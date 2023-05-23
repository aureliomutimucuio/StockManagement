/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodestock;

import java.time.LocalDateTime;
import java. util.Objects; 

/**
 *
 * @author Aurelio Mutimucuio
 */
public class Usuario {
    
    private long id;
    private String nome;
    private String senha;
    private String usario;
    private perfil perfil;
    private boolean estado;
    private LocalDateTime dataHoraCriacao;
    private  LocalDateTime ultimologin;
    
   public Usuario() {
    this.estado = true;
}

    public Usuario(long id, String nome, String senha, String usario, perfil perfil, LocalDateTime dataHoraCriacao, LocalDateTime ultimologin) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.usario = usario;
        this.perfil = perfil;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimologin = ultimologin;
        this.estado = true;
    }
  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(perfil perfil) {
        this.perfil = perfil;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimologin() {
        return ultimologin;
    }

    public void setUltimologin(LocalDateTime ultimologin) {
        this.ultimologin = ultimologin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public void reset(){
        this. estado = true;
        
    }
    
    public void mudarEstado(){
        this.estado = this.estado;
    }
}
