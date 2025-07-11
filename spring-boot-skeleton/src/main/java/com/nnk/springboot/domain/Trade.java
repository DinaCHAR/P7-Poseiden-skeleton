package com.nnk.springboot.domain;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "trade")
public class Trade {
    // TODO: Map columns in data table TRADE with corresponding java fields OK
		@Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    @Column(name = "trade_id")
	    private Integer tradeId;
	    @NotBlank(message = "Account is mandatory")
	    private String account;
	    private String type;
	    @Column(name = "buy_quantity")
	    private Double buyQuantity;
	    @Column(name = "sell_quantity")
	    private Double sellQuantity;
	    @Column(name = "buy_price")
	    private Double buyPrice;
	    @Column(name = "sell_price")
	    private Double sellPrice;
	    private String benchmark;
	    @Column(name = "trade_date")
	    private Timestamp tradeDate;
	    private String security;
	    private String status;
	    private String trader;
	    private String book;
	    @Column(name = "creation_name")
	    private String creationName;
	    @Column(name = "creation_date")
	    private Timestamp creationDate;
	    @Column(name = "revision_name")
	    private String revisionName;
	    @Column(name = "revision_date")
	    private Timestamp revisionDate;
	    @Column(name = "deal_name")
	    private String dealName;
	    @Column(name = "deal_type")
	    private String dealType;
	    @Column(name = "source_list_id")
	    private String sourceListId;
	    private String side;
	
	
	    public Trade(String account, String type) {
	        this.account = account;
	        this.type = type;
	    }
	
	    public Trade() {
	
	    }
	
	    public String getSide() {
	        return side;
	    }
	
	    public void setSide(String side) {
	        this.side = side;
	    }
	
	    public String getSourceListId() {
	        return sourceListId;
	    }
	
	    public void setSourceListId(String sourceListId) {
	        this.sourceListId = sourceListId;
	    }
	
	    public String getDealType() {
	        return dealType;
	    }
	
	    public void setDealType(String dealType) {
	        this.dealType = dealType;
	    }
	
	    public String getDealName() {
	        return dealName;
	    }
	
	    public void setDealName(String dealName) {
	        this.dealName = dealName;
	    }
	
	    public Timestamp getRevisionDate() {
	        return revisionDate;
	    }
	
	    public void setRevisionDate(Timestamp revisionDate) {
	        this.revisionDate = revisionDate;
	    }
	
	    public Timestamp getCreationDate() {
	        return creationDate;
	    }
	
	    public void setCreationDate(Timestamp creationDate) {
	        this.creationDate = creationDate;
	    }
	
	    public String getRevisionName() {
	        return revisionName;
	    }
	
	    public void setRevisionName(String revisionName) {
	        this.revisionName = revisionName;
	    }
	
	    public String getCreationName() {
	        return creationName;
	    }
	
	    public void setCreationName(String creationName) {
	        this.creationName = creationName;
	    }
	
	    public String getBook() {
	        return book;
	    }
	
	    public void setBook(String book) {
	        this.book = book;
	    }
	
	    public String getTrader() {
	        return trader;
	    }
	
	    public void setTrader(String trader) {
	        this.trader = trader;
	    }
	
	    public String getStatus() {
	        return status;
	    }
	
	    public void setStatus(String status) {
	        this.status = status;
	    }
	
	    public String getSecurity() {
	        return security;
	    }
	
	    public void setSecurity(String security) {
	        this.security = security;
	    }
	
	    public String getBenchmark() {
	        return benchmark;
	    }
	
	    public void setBenchmark(String benchmark) {
	        this.benchmark = benchmark;
	    }
	
	    public Timestamp getTradeDate() {
	        return tradeDate;
	    }
	
	    public void setTradeDate(Timestamp tradeDate) {
	        this.tradeDate = tradeDate;
	    }
	
	    public Double getSellPrice() {
	        return sellPrice;
	    }
	
	    public void setSellPrice(Double sellPrice) {
	        this.sellPrice = sellPrice;
	    }
	
	    public Double getBuyPrice() {
	        return buyPrice;
	    }
	
	    public void setBuyPrice(Double buyPrice) {
	        this.buyPrice = buyPrice;
	    }
	
	    public Double getSellQuantity() {
	        return sellQuantity;
	    }
	
	    public void setSellQuantity(Double sellQuantity) {
	        this.sellQuantity = sellQuantity;
	    }
	
	    public Double getBuyQuantity() {
	        return buyQuantity;
	    }
	
	    public void setBuyQuantity(Double buyQuantity) {
	        this.buyQuantity = buyQuantity;
	    }
	
	    public String getType() {
	        return type;
	    }
	
	    public void setType(String type) {
	        this.type = type;
	    }
	
	    public String getAccount() {
	        return account;
	    }
	
	    public void setAccount(String account) {
	        this.account = account;
	    }
	
	    public Integer getTradeId() {
	        return tradeId;
	    }
	
	    public void setTradeId(Integer tradeId) {
	        this.tradeId = tradeId;
	    }
	}
