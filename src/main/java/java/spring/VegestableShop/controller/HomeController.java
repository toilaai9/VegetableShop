package java.spring.VegestableShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
//Cần thiết cho Hibernate Transaction.
// source đâu mà chạy lỗi hết vậy
@Transactional
//Cần thiết để sử dụng RedirectAttributes
@EnableWebMvc
public class HomeController {
	@RequestMapping("/")
	public String indexPage() {
		return "Index";
	}
}
