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
@Table(name = "bill_info")
public class Bill_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@ManyToOne(targetEntity = Bill.class)
    @JoinColumn(name = "bill_id_belong",referencedColumnName = "id")
	private Bill bill_id_belong;
	@ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id_bought",referencedColumnName = "id")
	private Product product_id_bought;
	@Column(nullable = false)
	private long amount_bought;
	@Column(nullable = false, name = "time_bought", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp time_bought;
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
	
	
	
	public Bill_info( Bill bill_id_belong, Product product_id_bought, long amount_bought, Timestamp time_bought,
			Account created_id, Account updated_id, Timestamp created_at, Timestamp deleted_at, Timestamp updated_at) {
		super();
		
		this.bill_id_belong = bill_id_belong;
		this.product_id_bought = product_id_bought;
		this.amount_bought = amount_bought;
		this.time_bought = time_bought;
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
	public Bill getBill_id_belong() {
		return bill_id_belong;
	}
	public void setBill_id_belong(Bill bill_id_belong) {
		this.bill_id_belong = bill_id_belong;
	}
	public Product getProduct_id_bought() {
		return product_id_bought;
	}
	public void setProduct_id_bought(Product product_id_bought) {
		this.product_id_bought = product_id_bought;
	}
	public long getAmount_bought() {
		return amount_bought;
	}
	public void setAmount_bought(long amount_bought) {
		this.amount_bought = amount_bought;
	}
	public Timestamp getTime_bought() {
		return time_bought;
	}
	public void setTime_bought(Timestamp time_bought) {
		this.time_bought = time_bought;
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
