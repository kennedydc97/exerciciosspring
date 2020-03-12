package br.com.rd.exerciciospring.Controller;

import br.com.rd.exerciciospring.Servico.TbCupomServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class TB_CUPOM_CONTROLLER {

    @Autowired
    private TbCupomServico servico;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("achar-cupom")
    public ResponseEntity findByIdClienteAndDtVenda(@PathParam("idCliente") Long idCliente,
                                                    @PathParam("dtVenda") String dtVenda){
        return ResponseEntity.ok().body(servico.findByIdClienteAndDtVenda(idCliente, dtVenda));
    }

//    @Autowired
//    private TB_CUPOM_REPOSITORY repository;
//
//    @ResponseStatus(HttpStatus.FOUND)
//    @GetMapping("/tb-cupom")
//    public ResponseEntity<List<TB_CUPOM>> findByIdClienteAndDtVenda(@PathParam("idCliente") Long idCliente,
//                                                                    @PathParam("dtVenda") String dtVenda){
//        List<TB_CUPOM> tb_cupoms = new ArrayList<>();
//
//        if (idCliente != null && dtVenda != null) {
//            tb_cupoms = repository.findByIdClienteAndDtVenda(idCliente, dtVenda);
//        } else if (idCliente != null) {
//            tb_cupoms.add(repository.findById(idCliente).get());
//        } else if (dtVenda != null) {
//            tb_cupoms = repository.findByDtVenda(dtVenda);
//        }
//
//        if (tb_cupoms != null && tb_cupoms.size() > 0) {
//            return ResponseEntity.ok().body(tb_cupoms);
//        } else {
//            return ResponseEntity.badRequest().build();
//        }
//    }
    }