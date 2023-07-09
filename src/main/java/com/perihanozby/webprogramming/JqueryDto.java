package com.perihanozby.webprogramming;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JqueryDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;


    //FIRSTNAME
    @NotNull(message = "isminizi girmediniz")
    private String firstname;
    // EMAIL
    @NotNull(message = "email yazmadınız")
    private String email;

    // PASSWORD
    @NotNull(message = "şifreyi girmediniz")
    private String password;

    // PASSWORD
    @NotNull(message = "şifreyi tekrar girmediniz")
    private String confirm_password;


}
