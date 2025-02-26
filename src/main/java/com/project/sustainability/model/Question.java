package com.project.sustainability.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {

    private String questionId;
    private String text;
    private List<InputField> inputFields;
    private List<Validation> validations;


}
