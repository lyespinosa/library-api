package com.library.demo.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CreateBookGenderRequest {

    private Long bookId;

    private Long genderId;
}
