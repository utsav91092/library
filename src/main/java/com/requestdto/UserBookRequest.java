package com.requestdto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserBookRequest {

    @NotNull
    private Long bookId;


}
