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
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "id_buy",referencedColumnName = "id")
	private Account idbuy;
	@Column(nullable = false)
	private Boolean isbought;
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
	
	
	public Bill(Account id_buy, Boolean is_bought, Account created_id, Account updated_id, Timestamp created_at,
			Timestamp deleted_at, Timestamp updated_at) {
		super();
		this.idbuy = id_buy;
		this.isbought = is_bought;
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
	public Account getId_buy() {
		return idbuy;
	}
	public void setId_buy(Account id_buy) {
		this.idbuy = id_buy;
	}
	public Boolean getIs_bought() {
		return isbought;
	}
	public void setIs_bought(Boolean is_bought) {
		this.isbought = is_bought;
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
