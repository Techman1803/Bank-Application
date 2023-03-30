package com.example.AtmCard.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cards {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="card_id")
	private int CardId;
	
	@Column(name ="customer_id")
	private int customerId;
	
	@Column(name ="card_number")
	private String Cardnumber;
	
	@Column(name ="card_type")
	private String CardType;
	
	@Column(name ="expire_date")
	private LocalDate ExpireDate;

	public int getCardId() {
		return CardId;
	}

	public void setCardId(int cardId) {
		CardId = cardId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardnumber() {
		return Cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		Cardnumber = cardnumber;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public LocalDate getExpireDate() {
		return ExpireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		ExpireDate = expireDate;
	}

	@Override
	public String toString() {
		return "Cards [CardId=" + CardId + ", customerId=" + customerId + ", Cardnumber=" + Cardnumber + ", CardType="
				+ CardType + ", ExpireDate=" + ExpireDate + "]";
	}

	
	
}
