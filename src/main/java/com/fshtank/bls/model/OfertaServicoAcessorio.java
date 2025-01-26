package com.fshtank.bls.model;


import java.sql.Timestamp;

public class OfertaServicoAcessorio {

  private long id;
  private long usuarioId;
  private long ofertaStatusId;
  private String imagem;
  private String titulo;
  private String subtitulo;
  private int valor;
  private String numeroParcela;
  private int valorParcela;
  private Timestamp dataCadastro;
  private Timestamp dataAlteracao;
  private long campanhaId;
  private long campaignTypeId;
  private String campaignTypeDescription;
  private String campaignStatusDescription;
  private long seloId;
  private String textoJuridico;
  private long ordem;
  private long seloPromocionalId;
  private long ofertaDestaqueId;
  private String notifyMedia;
  private String destaqueNome;
  private String destaqueTemplate;
  private String veiculoNome;
  private String veiculoCategoria;
  private Timestamp campaignEndDate;
  private String itemImage;
  private String cta;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(long usuarioId) {
    this.usuarioId = usuarioId;
  }

  public long getOfertaStatusId() {
    return ofertaStatusId;
  }

  public void setOfertaStatusId(long ofertaStatusId) {
    this.ofertaStatusId = ofertaStatusId;
  }

  public String getImagem() {
    return imagem;
  }

  public void setImagem(String imagem) {
    this.imagem = imagem;
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

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public String getNumeroParcela() {
    return numeroParcela;
  }

  public void setNumeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  public int getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(int valorParcela) {
    this.valorParcela = valorParcela;
  }

  public Timestamp getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(Timestamp dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public Timestamp getDataAlteracao() {
    return dataAlteracao;
  }

  public void setDataAlteracao(Timestamp dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  public long getCampanhaId() {
    return campanhaId;
  }

  public void setCampanhaId(long campanhaId) {
    this.campanhaId = campanhaId;
  }

  public long getCampaignTypeId() {
    return campaignTypeId;
  }

  public void setCampaignTypeId(long campaignTypeId) {
    this.campaignTypeId = campaignTypeId;
  }

  public String getCampaignTypeDescription() {
    return campaignTypeDescription;
  }

  public void setCampaignTypeDescription(String campaignTypeDescription) {
    this.campaignTypeDescription = campaignTypeDescription;
  }

  public String getCampaignStatusDescription() {
    return campaignStatusDescription;
  }

  public void setCampaignStatusDescription(String campaignStatusDescription) {
    this.campaignStatusDescription = campaignStatusDescription;
  }

  public long getSeloId() {
    return seloId;
  }

  public void setSeloId(long seloId) {
    this.seloId = seloId;
  }

  public String getTextoJuridico() {
    return textoJuridico;
  }

  public void setTextoJuridico(String textoJuridico) {
    this.textoJuridico = textoJuridico;
  }

  public long getOrdem() {
    return ordem;
  }

  public void setOrdem(long ordem) {
    this.ordem = ordem;
  }

  public long getSeloPromocionalId() {
    return seloPromocionalId;
  }

  public void setSeloPromocionalId(long seloPromocionalId) {
    this.seloPromocionalId = seloPromocionalId;
  }

  public long getOfertaDestaqueId() {
    return ofertaDestaqueId;
  }

  public void setOfertaDestaqueId(long ofertaDestaqueId) {
    this.ofertaDestaqueId = ofertaDestaqueId;
  }

  public String getNotifyMedia() {
    return notifyMedia;
  }

  public void setNotifyMedia(String notifyMedia) {
    this.notifyMedia = notifyMedia;
  }

  public String getDestaqueNome() {
    return destaqueNome;
  }

  public void setDestaqueNome(String destaqueNome) {   this.destaqueNome = destaqueNome; }

  public String getDestaqueTemplate() {
    return destaqueTemplate;
  }

  public void setDestaqueTemplate(String destaqueTemplate) {
    this.destaqueTemplate = destaqueTemplate;
  }

  public String getVeiculoNome() {
    return veiculoNome;
  }

  public void setVeiculoNome(String veiculoNome) {
    this.veiculoNome = veiculoNome;
  }

  public String getVeiculoCategoria() {
    return veiculoCategoria;
  }

  public void setVeiculoCategoria(String veiculoCategoria) {
    this.veiculoCategoria = veiculoCategoria;
  }

  public Timestamp getCampaignEndDate() {
    return campaignEndDate;
  }

  public void setCampaignEndDate(Timestamp campaignEndDate) {
    this.campaignEndDate = campaignEndDate;
  }

  public String getItemImage() { return itemImage; }

  public void setItemImage(String itemImage) { this.itemImage = itemImage; }

  public String getCta() { return cta; }

  public void setCta(String cta) { this.cta = cta; }
}
