package com.nnz.onetomany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_demo")
public class TestDemo extends AuditModel{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String text_demo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText_demo() {
		return text_demo;
	}
	public void setText_demo(String text_demo) {
		this.text_demo = text_demo;
	}
	
	

}
