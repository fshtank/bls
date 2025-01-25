package com.fshtank.bls.model;

import java.sql.Timestamp;

public class PbcOfertaVeiculo {

    private long id;
    private long regiaoId;
    private long campanhaId;
    private long ofertaId;
    private long veiculoId;
    private long veiculoCategoriaId;
    private long veiculoNomeId;
    private boolean ofertaBackup;
    private long ofertaOrdem;
    private String indiceOferta;
    private String indiceModelo;
    private boolean exibirAno;
    private boolean exibirPrecoTabela;
    private boolean exibirBanner;
    private String veiculoNome;
    private String veiculoImagem;
    private String trim;
    private String powerTrain;
    private long ano;
    private String cor;
    private String seloCor;
    private String seloImagem;
    private String seloPromocionalImagem;
    private String titulo;
    private String subtitulo;
    private String anoMotor;
    private String preco;
    private String precoTabela;
    private String taxaJuros;
    private String valorEntrada;
    private String valorParcela;
    private String numeroParcela;
    private String campoLivre;
    private String textoJuridico;
    private long ofertaDestaqueId;
    private String destaqueNome;
    private String destaqueTemplate;
    private Timestamp campaignEndDate;
    private String vehicleType;
    private String MMC;
    private String Peg;
    private String VehicleCgiImage;
    private String specs;
    private int directSalesType;
    private String cta;

    public String getMMC() {
        return MMC;
    }

    public void setMMC(String MMC) {
        this.MMC = MMC;
    }

    public String getPeg() {
        return Peg;
    }

    public void setPeg(String peg) {
        Peg = peg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(long regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Long getCampanhaId() {
        return campanhaId;
    }

    public void setCampanhaId(Long campanhaId) {
        this.campanhaId = campanhaId;
    }

    public long getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(long ofertaId) {
        this.ofertaId = ofertaId;
    }

    public long getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(long veiculoId) {
        this.veiculoId = veiculoId;
    }

    public long getVeiculoCategoriaId() {
        return veiculoCategoriaId;
    }

    public void setVeiculoCategoriaId(long veiculoCategoriaId) {
        this.veiculoCategoriaId = veiculoCategoriaId;
    }

    public long getVeiculoNomeId() {
        return veiculoNomeId;
    }

    public void setVeiculoNomeId(long veiculoNomeId) {
        this.veiculoNomeId = veiculoNomeId;
    }

    public boolean isOfertaBackup() { return ofertaBackup; }

    public void setOfertaBackup(boolean ofertaBackup) { this.ofertaBackup = ofertaBackup; }

    public long getOfertaOrdem() {
        return ofertaOrdem;
    }

    public void setOfertaOrdem(long ofertaOrdem) {
        this.ofertaOrdem = ofertaOrdem;
    }

    public String getIndiceOferta() {
        return indiceOferta;
    }

    public void setIndiceOferta(String indiceOferta) {
        this.indiceOferta = indiceOferta;
    }

    public String getIndiceModelo() {
        return indiceModelo;
    }

    public void setIndiceModelo(String indiceModelo) {
        this.indiceModelo = indiceModelo;
    }

    public boolean isExibirAno() { return exibirAno; }

    public void setExibirAno(boolean exibirAno) { this.exibirAno = exibirAno; }

    public boolean isExibirPrecoTabela() { return exibirPrecoTabela;  }

    public void setExibirPrecoTabela(boolean exibirPrecoTabela) { this.exibirPrecoTabela = exibirPrecoTabela; }

    public boolean isExibirBanner() { return exibirBanner; }

    public void setExibirBanner(boolean exibirBanner) { this.exibirBanner = exibirBanner; }

    public String getVeiculoNome() {
        return veiculoNome;
    }

    public void setVeiculoNome(String veiculoNome) {
        this.veiculoNome = veiculoNome;
    }

    public String getVeiculoImagem() {
        return veiculoImagem;
    }

    public void setVeiculoImagem(String veiculoImagem) {
        this.veiculoImagem = veiculoImagem;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getPowerTrain() {
        return powerTrain;
    }

    public void setPowerTrain(String powerTrain) {
        this.powerTrain = powerTrain;
    }

    public long getAno() {
        return ano;
    }

    public void setAno(long ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSeloCor() {
        return seloCor;
    }

    public void setSeloCor(String seloCor) {
        this.seloCor = seloCor;
    }

    public String getSeloImagem() {
        return seloImagem;
    }

    public void setSeloImagem(String seloImagem) {
        this.seloImagem = seloImagem;
    }

    public String getSeloPromocionalImagem() {
        return seloPromocionalImagem;
    }

    public void setSeloPromocionalImagem(String seloPromocionalImagem) {
        this.seloPromocionalImagem = seloPromocionalImagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAnoMotor() {
        return anoMotor;
    }

    public void setAnoMotor(String anoMotor) {
        this.anoMotor = anoMotor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getPrecoTabela() { return precoTabela; }

    public void setPrecoTabela(String precoTabela) {
        this.precoTabela = precoTabela;
    }

    public String getTaxaJuros() { return taxaJuros; }

    public void setTaxaJuros(String taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public String getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(String valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(String valorParcela) {
        this.valorParcela = valorParcela;
    }

    public String getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(String numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public String getCampoLivre() {
        return campoLivre;
    }

    public void setCampoLivre(String campoLivre) {
        this.campoLivre = campoLivre;
    }

    public String getTextoJuridico() {
        return textoJuridico;
    }

    public void setTextoJuridico(String textoJuridico) {
        this.textoJuridico = textoJuridico;
    }

    public long getOfertaDestaqueId() {
        return ofertaDestaqueId;
    }

    public void setOfertaDestaqueId(long ofertaDestaqueId) {
        this.ofertaDestaqueId = ofertaDestaqueId;
    }

    public String getDestaqueNome() {
        return destaqueNome;
    }

    public void setDestaqueNome(String destaqueNome) {
        this.destaqueNome = destaqueNome;
    }

    public String getDestaqueTemplate() {
        return destaqueTemplate;
    }

    public void setDestaqueTemplate(String destaqueTemplate) {
        this.destaqueTemplate = destaqueTemplate;
    }

    public Timestamp getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(Timestamp campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleCgiImage() { return VehicleCgiImage; }

    public void setVehicleCgiImage(String vehicleCgiImage) { VehicleCgiImage = vehicleCgiImage; }

    public String getSpecs() { return specs; }

    public void setSpecs(String specs) { this.specs = specs; }

    public int getDirectSalesType() { return directSalesType; }

    public void setDirectSalesType(int directSalesType) { this.directSalesType = directSalesType; }

    public String getCta() { return cta; }

    public void setCta(String cta) { this.cta = cta; }
}
