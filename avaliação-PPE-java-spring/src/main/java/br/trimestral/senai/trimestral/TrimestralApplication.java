package br.trimestral.senai.trimestral;

import br.trimestral.senai.trimestral.model.Filial;
import br.trimestral.senai.trimestral.repository.FilialRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TrimestralApplication {

    private final FilialRepository filialRepository;


    public TrimestralApplication(FilialRepository filialRepository) {
        this.filialRepository = filialRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(TrimestralApplication.class, args);
    }

    @PostConstruct
    public void popularBanco() {
        filialRepository.save(new Filial("matheus", "florianopolis", "intelbras"));
        filialRepository.save(new Filial("matheus", "florianopolis", "intelbras"));
    }
}

