package com.nemanjamarjanovic.ispitpj.error;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class ExceptionModel {

    private String message;
    private String path;
    private String name;

}

