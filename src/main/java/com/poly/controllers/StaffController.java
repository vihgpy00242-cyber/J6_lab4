package com.poly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.poly.models.Staff;

import jakarta.validation.Valid;

@Controller
public class StaffController {
	@RequestMapping("/staff/form")
	public String requestMethodName(Model model,@ModelAttribute("staff")Staff staff) {
		model.addAttribute("messege","Vui long nhap thong tin nhan vien");
		return "form";
	}
	@RequestMapping("/staff/save")
	public String requestMethodName(Model model,@RequestPart("photo_file") MultipartFile photoFile,
			@ModelAttribute("staff")@Valid Staff staff,Errors errors) {
		System.out.println("photo"+ photoFile.getOriginalFilename());
//        Đảm bảo ứng dụng chạy trên HTTPS: Đây là điều kiện tiên quyết. Bạn cần cấu hình server (Tomcat, Nginx, Apache, v.v.) để sử dụng HTTPS.
            staff.setPhoto(photoFile.getOriginalFilename()); // Chỉ lưu tên file
        
			if(errors.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các lỗi sau!");
			} else {
				model.addAttribute("message", "Dữ liệu đã nhập đúng!");
				}
		return "form";
	}
	
}
