package org.serratec.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produtc_id")
	private Integer productId;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "description", nullable = false, length = 500)
	private String description;

	@Column(name = "price", nullable = false)
	private Double price;
}
