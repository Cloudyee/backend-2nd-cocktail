package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "t_cocktail")
public class Cocktail {

	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "c_name")
	private String name;

	@Column(name = "c_desc")
	private String description;

	@Column(name = "c_al")
	private String alchol;

	@Column(name = "c_link")
	private String imgLink;

	@ManyToOne
	@JoinColumn(name = "c_type")
	private CocktailType cocktailType;

}