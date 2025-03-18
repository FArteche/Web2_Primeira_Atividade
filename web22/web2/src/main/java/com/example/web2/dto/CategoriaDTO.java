package com.example.web2.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaDTO(@NotBlank String nome) {

}
