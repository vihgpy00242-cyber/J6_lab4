package com.poly.models;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Staff {
	@NotBlank(message = "Khong bo trong email !")
	@Email(message = "Vui long nhap dung dinh dang !")
	private String id;
	@NotBlank(message = "Khong bo trong ten !")
	private String fullname;
	private String photo ;
	@NotNull(message = "Hay chon gioi tinh !")
	private Boolean gender ;
	@NotNull(message = "Hay chon ngay sinh !")
	@Past(message = "Ngay sinh khong ton tai !")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthday = new Date();
	@Positive(message = "Vui long nhap lon hon 0")
	@NotNull(message = "Hay nhap luong !")
	private Double salary ;
	@NotNull(message = "Hay nhap level !")
	private Integer level ;
}
