package com.telusko.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	private Date releaseDate;
	private Boolean productAvailable;
	private Integer stockQuantity;
	
	private String imageName;
	private String imageType;
	@Lob
	private byte[] imageDate;
	

	public Product() {
	}
	
	public Product(Integer id, String name, String description, String brand,
            BigDecimal price, String category, Date releaseDate,
            Boolean available, Integer quantity) {
		 this.id = id;
		 this.name = name;
		 this.description = description;
		 this.brand = brand;
		 this.price = price;
		 this.category = category;
		 this.releaseDate = releaseDate;
		 this.productAvailable = available;
		 this.stockQuantity = quantity;
	}
	
	public String getImageName() {
		return imageName;
	}
	
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	public String getImageType() {
		return imageType;
	}
	
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	public byte[] getImageDate() {
		return imageDate;
	}
	
	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}
	
	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public String getBrand() {
	    return brand;
	}

	public void setBrand(String brand) {
	    this.brand = brand;
	}

	public BigDecimal getPrice() {
	    return price;
	}

	public void setPrice(BigDecimal price) {
	    this.price = price;
	}

	public String getCategory() {
	    return category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

	public Date getReleaseDate() {
	    return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
	    this.releaseDate = releaseDate;
	}

	public Boolean isProductAvailable() {
	    return productAvailable;
	}

	public void setProductAvailable(Boolean productAvailable) {
	    this.productAvailable = productAvailable;
	}

	public Integer getStockQuantity() {
	    return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
	    this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + description + ", brand=" + brand + ", price=" + price
				+ ", category=" + category + ", releaseDate=" + releaseDate + ", available=" + productAvailable + ", quantity="
				+ stockQuantity + "]";
	}
	
}
