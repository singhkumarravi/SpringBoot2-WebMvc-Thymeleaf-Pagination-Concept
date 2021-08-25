package com.olive.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="egender")
	private String empGen;
	@Column(name="edept")
	private String empDept;
	@Column(name="e_language")
	@ElementCollection
	@CollectionTable(name="lang_Tab")
	private List<String> empLangs; 

}
