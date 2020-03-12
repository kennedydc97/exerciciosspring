package br.com.rd.exerciciospring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class TB_CUPOM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cupom")
    private Long idCupom;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    private String dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;



}
