package com.giovanniEstudo.cursoMC.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.giovanniEstudo.cursoMC.enums.EstadoPagamentoEnum;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoletoEntity extends PagamentoEntity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoComBoletoEntity(){

    }

    public PagamentoComBoletoEntity(Integer id, EstadoPagamentoEnum estadoPagamento, PedidoEntity pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estadoPagamento, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
