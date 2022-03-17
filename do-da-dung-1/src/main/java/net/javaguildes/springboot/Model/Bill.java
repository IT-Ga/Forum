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
	private Account id_buy;
	@Column(nullable = false)
	private Boolean is_bought;
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
	
	
	public Bill(Account id_buy, Boolean is_bought, Account created_id, Account updated_id, Timestamp created_at,
			Timestamp deleted_at, Timestamp updated_at) {
		super();
		this.id_buy = id_buy;
		this.is_bought = is_bought;
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
	public Account getId_buy() {
		return id_buy;
	}
	public void setId_buy(Account id_buy) {
		this.id_buy = id_buy;
	}
	public Boolean getIs_bought() {
		return is_bought;
	}
	public void setIs_bought(Boolean is_bought) {
		this.is_bought = is_bought;
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
