package com.perihanozby.webprogramming;

import com.perihanozby.data.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "jquery")

public class JqueryEntity extends BaseEntity implements Serializable {

    public static final long serialVersionUID = 1L;


    @Column(name = "firstname")
    private String firstname;


    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "confirmpassword")
    private String confirm_password;

}
