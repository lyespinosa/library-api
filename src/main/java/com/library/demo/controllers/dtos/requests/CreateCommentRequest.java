package com.library.demo.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter @Setter
public class CreateCommentRequest {

    @NotNull @NotBlank
    private Long userId;

    @NotNull @NotBlank
    private Long bookId;

    @NotBlank @NotNull
    private String content;

    @NotNull @NotBlank
    private LocalDate date;
}