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
	private Bill billidbelong;
	@ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id_bought",referencedColumnName = "id")
	private Product productidbought;
	@Column(nullable = false)
	private long amountbought;
	@Column(nullable = false, name = "time_bought", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp timebought;
	@ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "created_id",referencedColumnName = "id")
	private Account createdid;
	@ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "updatedid",referencedColumnName = "id")
	private Account updatedid;
	@Column(nullable = false, name = "created_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdat;
	@Column(nullable = false, name = "deleted_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp deletedat;
	@Column(nullable = false, name = "updated_at", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedat;
	
	
	
	public Bill_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill_info( Bill bill_id_belong, Product product_id_bought, long amount_bought, Timestamp time_bought,
			Account created_id, Account updated_id, Timestamp created_at, Timestamp deleted_at, Timestamp updated_at) {
		super();
		
		this.billidbelong = bill_id_belong;
		this.productidbought = product_id_bought;
		this.amountbought = amount_bought;
		this.timebought = time_bought;
		this.createdid = created_id;
		this.updatedid = updated_id;
		this.createdat = created_at;
		this.deletedat = deleted_at;
		this.updatedat = updated_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Bill getBill_id_belong() {
		return billidbelong;
	}
	public void setBill_id_belong(Bill bill_id_belong) {
		this.billidbelong = bill_id_belong;
	}
	public Product getProduct_id_bought() {
		return productidbought;
	}
	public void setProduct_id_bought(Product product_id_bought) {
		this.productidbought = product_id_bought;
	}
	public long getAmount_bought() {
		return amountbought;
	}
	public void setAmount_bought(long amount_bought) {
		this.amountbought = amount_bought;
	}
	public Timestamp getTime_bought() {
		return timebought;
	}
	public void setTime_bought(Timestamp time_bought) {
		this.timebought = time_bought;
	}
	public Account getCreated_id() {
		return createdid;
	}
	public void setCreated_id(Account created_id) {
		this.createdid = created_id;
	}
	public Account getUpdated_id() {
		return updatedid;
	}
	public void setUpdated_id(Account updated_id) {
		this.updatedid = updated_id;
	}
	public Timestamp getCreated_at() {
		return createdat;
	}
	public void setCreated_at(Timestamp created_at) {
		this.createdat = created_at;
	}
	public Timestamp getDeleted_at() {
		return deletedat;
	}
	public void setDeleted_at(Timestamp deleted_at) {
		this.deletedat = deleted_at;
	}
	public Timestamp getUpdated_at() {
		return updatedat;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updatedat = updated_at;
	}
	
	
}
