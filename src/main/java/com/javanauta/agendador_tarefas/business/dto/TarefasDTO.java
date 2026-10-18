package com.javanauta.agendador_tarefas.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.javanauta.agendador_tarefas.infrastructure.entity.enums.StatusNotificacaoEnum;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {


    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:yyyy:ss")
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAltercao;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
