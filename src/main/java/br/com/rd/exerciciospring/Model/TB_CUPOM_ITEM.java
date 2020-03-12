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
@Table(name = "tb_cupom_item")
public class TB_CUPOM_ITEM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name = "id_cupom")
    private TB_CUPOM tb_cupom;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private TB_PRODUTO tb_produto;

    @Column(name = "qt_produto")
    private Long qt_produto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;


}
