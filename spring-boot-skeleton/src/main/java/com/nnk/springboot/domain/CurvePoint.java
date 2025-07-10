package com.nnk.springboot.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.sql.Timestamp;


@Entity
@Table(name = "curvepoint")
public class CurvePoint {
    // TODO: Map columns in data table CURVEPOINT with corresponding java fields OK
	    @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private Integer id;
	    @Column(name = "curve_id")
	    @NotNull(message = "Must not be null")
	    private Integer curveId;
	    @Column(name = "as_of_date")
	    private Timestamp asOfDate;
	    private Double term;
	    private Double value;
	    @Column(name = "creation_date")
	    private Timestamp creationDate;
	
	
	    public CurvePoint(Integer curveId, Double term, Double value) {
	        this.curveId = curveId;
	        this.term = term;
	        this.value = value;
	    }
	
	    public CurvePoint() {
	
	    }
	
	    public Integer getId() {
	        return id;
	    }
	
	    public void setId(Integer id) {
	        this.id = id;
	    }
	
	    public Integer getCurveId() {
	        return curveId;
	    }
	
	    public void setCurveId(Integer curveId) {
	        this.curveId = curveId;
	    }
	
	    public Timestamp getAsOfDate() {
	        return asOfDate;
	    }
	
	    public void setAsOfDate(Timestamp asOfDate) {
	        this.asOfDate = asOfDate;
	    }
	
	    public Double getTerm() {
	        return term;
	    }
	
	    public void setTerm(Double term) {
	        this.term = term;
	    }
	
	    public Double getValue() {
	        return value;
	    }
	
	    public void setValue(Double value) {
	        this.value = value;
	    }
	
	    public Timestamp getCreationDate() {
	        return creationDate;
	    }
	
	    public void setCreationDate(Timestamp creationDate) {
	        this.creationDate = creationDate;
	    }
	}
