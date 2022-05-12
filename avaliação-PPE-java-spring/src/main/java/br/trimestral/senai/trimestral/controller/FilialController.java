package br.trimestral.senai.trimestral.controller;

import br.trimestral.senai.trimestral.repository.FilialRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("filial")
public class FilialController {

    private final FilialRepository filialRepository;


    public FilialController(FilialRepository filialRepository) {
        this.filialRepository = filialRepository;
    }
    @GetMapping("list")
    public void list(Model model){
        model.addAttribute("filiais", filialRepository.findAll());
    }
}
