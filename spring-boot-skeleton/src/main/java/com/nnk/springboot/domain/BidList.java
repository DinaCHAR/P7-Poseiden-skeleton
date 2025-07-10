package com.nnk.springboot.domain;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "bidlist")
public class BidList {
		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    @Column(name = "bidlist_id")
	    private Integer bidListId;
	    @NotBlank(message = "Account is mandatory")
	    private String account;
	    
	    @NotBlank(message = "Type is mandatory")
	    private String type;
	    
	    @NotNull(message = "Bid Quantity is mandatory")
	    @Column(name = "bid_quantity")
	    private Double bidQuantity;
	    @Column(name = "ask_quantity")
	    private Double askQuantity;
	    private Double bid;
	    private Double ask;
	    private String benchmark;
	    @Column(name = "bid_list_date")
	    private Timestamp bidListDate;
	    private String commentary;
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
	    @Column(name = "source_listid")
	    private String sourceListID;
	    private String side;
	
	    public BidList(String account,  String type, Double bidQuantity ) {
	        this.bidQuantity = bidQuantity;
	        this.type = type;
	        this.account = account;
	    }
	
	    public BidList() {
	
	    }
	
	    public String getAccount() {
	        return account;
	    }
	
	    public void setAccount(String account) {
	        this.account = account;
	    }
	
	    public Integer getBidListId() {
	        return bidListId;
	    }
	
	    public void setBidListId(Integer bidListId) {
	        this.bidListId = bidListId;
	    }
	
	    public String getType() {
	        return type;
	    }
	
	    public void setType(String type) {
	        this.type = type;
	    }
	
	    public Double getAskQuantity() {
	        return askQuantity;
	    }
	
	    public void setAskQuantity(Double askQuantity) {
	        this.askQuantity = askQuantity;
	    }
	
	    public Double getBidQuantity() {
	        return bidQuantity;
	    }
	
	    public void setBidQuantity(Double bidQuantity) {
	        this.bidQuantity = bidQuantity;
	    }
	
	    public Double getBid() {
	        return bid;
	    }
	
	    public void setBid(Double bid) {
	        this.bid = bid;
	    }
	
	    public String getBenchmark() {
	        return benchmark;
	    }
	
	    public void setBenchmark(String benchmark) {
	        this.benchmark = benchmark;
	    }
	
	    public Double getAsk() {
	        return ask;
	    }
	
	    public void setAsk(Double ask) {
	        this.ask = ask;
	    }
	
	    public Timestamp getBidListDate() {
	        return bidListDate;
	    }
	
	    public void setBidListDate(Timestamp bidListDate) {
	        this.bidListDate = bidListDate;
	    }
	
	    public String getCommentary() {
	        return commentary;
	    }
	
	    public void setCommentary(String commentary) {
	        this.commentary = commentary;
	    }
	
	    public String getSecurity() {
	        return security;
	    }
	
	    public void setSecurity(String security) {
	        this.security = security;
	    }
	
	    public String getStatus() {
	        return status;
	    }
	
	    public void setStatus(String status) {
	        this.status = status;
	    }
	
	    public String getTrader() {
	        return trader;
	    }
	
	    public void setTrader(String trader) {
	        this.trader = trader;
	    }
	
	    public String getBook() {
	        return book;
	    }
	
	    public void setBook(String book) {
	        this.book = book;
	    }
	
	    public String getCreationName() {
	        return creationName;
	    }
	
	    public void setCreationName(String creationName) {
	        this.creationName = creationName;
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
	
	    public Timestamp getRevisionDate() {
	        return revisionDate;
	    }
	
	    public void setRevisionDate(Timestamp revisionDate) {
	        this.revisionDate = revisionDate;
	    }
	
	    public String getDealName() {
	        return dealName;
	    }
	
	    public void setDealName(String dealName) {
	        this.dealName = dealName;
	    }
	
	    public String getDealType() {
	        return dealType;
	    }
	
	    public void setDealType(String dealType) {
	        this.dealType = dealType;
	    }
	
	    public String getSourceListID() {
	        return sourceListID;
	    }
	
	    public void setSourceListID(String sourceListID) {
	        this.sourceListID = sourceListID;
	    }
	
	    public String getSide() {
	        return side;
	    }
	
	    public void setSide(String side) {
	        this.side = side;
	    }
	
	
	    // TODO: Map columns in data table BIDLIST with corresponding java fields OK
	}
}
