package com.ecommerce.api.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Data
public class UserDTO {

    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String name;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @Pattern(regexp = "\\+?[0-9]{10,15}", message = "Número de telefone inválido")
    private String phone;

    @NotBlank(message = "Senha é obrigatório")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    private String password;

    @NotBlank(message = "O papel do usuário é obrigatório")
    private String roles;

    @Past(message = "Data de nascimento inválida")
    private LocalDate birthDate;
}