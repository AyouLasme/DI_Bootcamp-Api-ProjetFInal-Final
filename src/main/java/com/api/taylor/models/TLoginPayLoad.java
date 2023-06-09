package com.api.taylor.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(scope = TLoginPayLoad.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TLoginPayLoad {
    private long id;
    private String email;

    private String password;
}
