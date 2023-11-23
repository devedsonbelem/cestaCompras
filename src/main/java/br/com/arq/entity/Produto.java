package br.com.arq.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Produto implements Serializable {
  
 
	private static final long serialVersionUID = 2L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	private String name;
	private String descrition;
	private Double price;
	@OneToOne
	@JoinColumn(name="idItem" )
	private ItemProduto itemProduto;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Produto(Long idProduto, String name, String descrition, Double price) {
		super();
		this.idProduto = idProduto;
		this.name = name;
		this.descrition = descrition;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", name=" + name + ", descrition=" + descrition + ", price=" + price
				+ "]";
	}


	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	public ItemProduto getItemProduto() {
		return itemProduto;
	}


	public void setItemProduto(ItemProduto itemProduto) {
		this.itemProduto = itemProduto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
