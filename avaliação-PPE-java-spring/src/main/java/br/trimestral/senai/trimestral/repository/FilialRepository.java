package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Filial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilialRepository extends JpaRepository<Filial, Long> {
    Optional<Filial> findByNome(String nome);

    Optional<Filial> findByLocalizacao(String localizacao);

    Optional<Filial> findByRazaoSocial(String razaoSocial);

}


