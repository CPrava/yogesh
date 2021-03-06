package com.hex.vo;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
	
@Id
@Column(name = "productid")
	private Integer productid;
@Column(name = "name")
	private String name;
@Column(name = "categoryid")
	private Integer categoryid;
@Column(name = "description")
	private String description;
@Column(name = "manufactureddate")
	private Date manufactureddate;
@Column(name = "price")
	private Integer price;
@Column(name = "quantity")
	private Integer quantity;
@Column(name = "createddate")
	private Date createddate=null;
@Column(name = "createdby")
	private String createdby="";
@Column(name = "modifieddate")
	private Date modifieddate=null;
@Column(name = "modifiedby")
	private String modifiedby="";
@Column(name = "productname")
	private String productname;


    @Transient
	private Integer hashcode=-1;
    @Transient
	private Boolean toBeDeleted=false;

	public void setHashcode(Integer newValue) { 
		hashcode = newValue; 
	}

	public Integer getHashcode() { 
		return hashcode;
 	}
	
	public Boolean getToBeDeleted() {
		return toBeDeleted;
	}

	public void setToBeDeleted(Boolean toBeDeleted) {
		this.toBeDeleted = toBeDeleted;
	}
	
		public void setProductid(Integer newValue) { 
		productid = newValue; 
	}

	public Integer getProductid() { 
		return productid;
 	}

	public void setName(String newValue) { 
		name = newValue; 
	}

	public String getName() { 
		return name;
 	}

	public void setCategoryid(Integer newValue) { 
		categoryid = newValue; 
	}

	public Integer getCategoryid() { 
		return categoryid;
 	}

	public void setDescription(String newValue) { 
		description = newValue; 
	}

	public String getDescription() { 
		return description;
 	}

	public void setManufactureddate(Date newValue) { 
		manufactureddate = newValue; 
	}

	public Date getManufactureddate() { 
		return manufactureddate;
 	}

	public void setPrice(Integer newValue) { 
		price = newValue; 
	}

	public Integer getPrice() { 
		return price;
 	}

	public void setQuantity(Integer newValue) { 
		quantity = newValue; 
	}

	public Integer getQuantity() { 
		return quantity;
 	}

	public void setCreateddate(Date newValue) { 
		createddate = newValue; 
	}

	public Date getCreateddate() { 
		return createddate;
 	}

	public void setCreatedby(String newValue) { 
		createdby = newValue; 
	}

	public String getCreatedby() { 
		return createdby;
 	}

	public void setModifieddate(Date newValue) { 
		modifieddate = newValue; 
	}

	public Date getModifieddate() { 
		return modifieddate;
 	}

	public void setModifiedby(String newValue) { 
		modifiedby = newValue; 
	}

	public String getModifiedby() { 
		return modifiedby;
 	}

	public void setProductname(String newValue) { 
		productname = newValue; 
	}

	public String getProductname() { 
		return productname;
 	}


}
