package com.tech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Validated
@Schema(name = "UserDetail", description = "UserDetail model")
public class UserDetail {

    @Schema(format = "number", description = "Provide id")
    @JsonProperty("id")
    private Long id;

    @NotNull(message = "Username can't be null.")
    @Schema(format = "string", required = true, description = "Provide username")
    @JsonProperty("username")
    private String username;

    @NotNull(message = "Email can't be null.")
    @Email
    @Schema(format = "string", required = true, description = "Provide email")
    @JsonProperty("email")
    private String email;

    @NotNull(message = "Password can't be null.")
    @Schema(format = "string", required = true, description = "Provide password")
    @JsonProperty("password")
    private String password;
}


