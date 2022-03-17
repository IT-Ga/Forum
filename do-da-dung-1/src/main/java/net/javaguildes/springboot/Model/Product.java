package net.javaguildes.springboot.Model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String product_name;
	private long amount;
	private long price;
	private String image;
	private Boolean status;
	@ManyToOne(targetEntity = Type_product.class)
    @JoinColumn(name = "typeid_belong",referencedColumnName = "id")
	private Type_product typeid_belong;
	@ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "created_id",referencedColumnName = "id")
	private Account created_id;
	@ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "updated_id",referencedColumnName = "id")
	private Account updated_id;
	@Column(nullable = false, name = "created_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp created_at;
	@Column(nullable = false, name = "deleted_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp deleted_at;
	@Column(nullable = false, name = "updated_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updated_at;
	
	
	public Product(String product_name, long amount, long price, String image, Boolean status,
			Type_product typeid_belong, Account created_id, Account updated_id, Timestamp created_at,
			Timestamp deleted_at, Timestamp updated_at) {
		super();
		this.product_name = product_name;
		this.amount = amount;
		this.price = price;
		this.image = image;
		this.status = status;
		this.typeid_belong = typeid_belong;
		this.created_id = created_id;
		this.updated_id = updated_id;
		this.created_at = created_at;
		this.deleted_at = deleted_at;
		this.updated_at = updated_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Type_product getTypeid_belong() {
		return typeid_belong;
	}
	public void setTypeid_belong(Type_product typeid_belong) {
		this.typeid_belong = typeid_belong;
	}
	public Account getCreated_id() {
		return created_id;
	}
	public void setCreated_id(Account created_id) {
		this.created_id = created_id;
	}
	public Account getUpdated_id() {
		return updated_id;
	}
	public void setUpdated_id(Account updated_id) {
		this.updated_id = updated_id;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Timestamp deleted_at) {
		this.deleted_at = deleted_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
}
