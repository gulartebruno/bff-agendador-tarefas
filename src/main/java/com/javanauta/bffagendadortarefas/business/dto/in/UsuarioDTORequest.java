package com.javanauta.bffagendadortarefas.business.dto.in;


import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder

public class UsuarioDTORequest {

    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTORequest> enderecos;
    private List<TelefoneDTORequest> telefones;



}
