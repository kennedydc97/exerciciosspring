package br.com.rd.exerciciospring.Repository;

import br.com.rd.exerciciospring.Model.TB_CUPOM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TB_CUPOM_REPOSITORY extends JpaRepository<TB_CUPOM, Long>{
    public List<TB_CUPOM> findByIdClienteAndDtVenda(Long idCliente, String dtVenda);
    public List<TB_CUPOM> findByDtVenda(String dtVenda);
}
