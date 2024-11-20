package com.apress.todo.validation;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

public class ToDoValidationError {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> errors = new ArrayList<>();

    private final String errorMassage;

    public ToDoValidationError(String errorMassage){
        this.errorMassage = errorMassage;
    }

    public void addValidationError(String error){
        errors.add(error);
    }

    public List<String> getErrors(){
        return errors;
    }

    public String getErrorMassage(){
        return errorMassage;
    }

}
