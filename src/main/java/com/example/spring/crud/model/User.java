package com.example.spring.crud.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USER_DETAILS")

@Schema(description = "User entity representing a system user")
public class User {
    @Schema(description = "Unique ID of the user", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Schema(description = "Full name of the user", example = "John Doe")
    @NotBlank
    private String username;
    @Schema(description = "password", example = "John@1")
    @NotBlank
    private String password;
    @Schema(description = "Email address", example = "john.doe@example.com")
    private String email;
    @Schema(description = "Name", example = "john")
    private String name;

}


