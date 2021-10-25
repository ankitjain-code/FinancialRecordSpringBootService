package bits.pilani.financial.record;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FinancialRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String currency;
	private float amount;
	
	protected FinancialRecord() {
	}

	protected FinancialRecord(String item, float amount) {
		this.currency = item;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return currency;
	}

	public void setItem(String item) {
		this.currency = item;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return id + ". " + currency + " - " + amount + " USD";		
	}	
}
