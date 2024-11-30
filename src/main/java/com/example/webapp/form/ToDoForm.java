package com.example.webapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoForm {

	private Integer id;

	@NotBlank(message = "ToDoは必須です")
	private String todo;

	@Size(min = 1, max = 100, message = "詳細は{min}~{max}文字以内で入力してください。")
	private String detail;

	private Boolean isNew;
}
