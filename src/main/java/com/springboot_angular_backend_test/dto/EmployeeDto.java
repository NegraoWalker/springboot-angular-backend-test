package com.springboot_angular_backend_test.dto;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class EmployeeDto {
    private Long id;
    @Size(min = 2, max = 30, message = "O campo nome deve ser preenchido com no mínimo 2 caracteres e no máximo 30")
    private String firstName;
    @Size(min = 2, max = 50, message = "O campo sobrenome deve ser preenchido com no mínimo 2 caracteres e no máximo 50")
    private String lastName;
    @Email(message = "O e-mail deve ser válido!", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String emailId;
    @Digits(integer = 11, message = "O número NIS deve ter 11 digitos", fraction = 0)
    private Long numberNis;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstName, String lastName, String emailId, Long numberNis) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.numberNis = numberNis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getNumberNis() {
        return numberNis;
    }

    public void setNumberNis(Long numberNis) {
        this.numberNis = numberNis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDto that = (EmployeeDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
