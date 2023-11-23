package br.com.arq.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ItemProduto implements Serializable {
 
 
	   private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idItem;
		private String quantidade;
		
		@OneToOne(mappedBy="itemProduto",
				  cascade= {CascadeType.ALL})
		private Produto produto;
		
		
		public ItemProduto() {
			 
		}
		
		
		
		public ItemProduto(Long idItem, String quantidade, Produto produto) {
			super();
			this.idItem = idItem;
			this.quantidade = quantidade;
			this.produto = produto;
		}



		@Override
		public String toString() {
			return "ItemProduto [idItem=" + idItem + ", quantidade=" + quantidade + ", produto=" + produto + "]";
		}



		public Long getIdItem() {
			return idItem;
		}
		public void setIdItem(Long idItem) {
			this.idItem = idItem;
		}
		public String getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		
 
}
