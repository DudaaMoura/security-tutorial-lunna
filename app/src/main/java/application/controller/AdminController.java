package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("")
    public String index() {
        return "admin/index";
    }
}

//Esse código Java é parte de um aplicativo Spring, mais especificamente um controlador ('controller')
//que lida com requisições relacionadas á administração ('admin').
//Em resumo, quando uma aquisição é feita para uma URL que começa com "/admin", o método 'index' deste controlador é chamado,
//e ele retorna a string "admin/index".
