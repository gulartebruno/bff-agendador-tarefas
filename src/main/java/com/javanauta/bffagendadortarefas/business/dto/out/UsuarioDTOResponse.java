package com.javanauta.bffagendadortarefas.business.dto.out;


import com.javanauta.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.javanauta.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTOResponse {

    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTORequest> enderecos;
    private List<TelefoneDTORequest> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<EnderecoDTORequest> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTORequest> enderecos) {
        this.enderecos = enderecos;
    }

    public List<TelefoneDTORequest> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDTORequest> telefones) {
        this.telefones = telefones;
    }
}
