package org.serratec.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_image")
public class ProductImageEntity {

    @Id
    @Column(name = "produtc_id")
    private Integer productId;

    @Column(name = "product_image_name", nullable = false)
    private String productImageName;

    @Column(name = "mime_type", nullable = false)
    private String mimeType;

    @Column(name = "product_image_data", nullable = false)
    private byte[] productImageData;
}