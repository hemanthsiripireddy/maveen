package com.hemanth.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@Entity
@Builder
@Data
@AllArgsConstructor
@Getter
@Setter
public class User {



    private String firstName;

    private String lastName;

    private String email;
}
