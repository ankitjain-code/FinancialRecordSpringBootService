package bits.pilani.financial.record;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialRecordController {


	@Autowired
	private FinancialRecordRepository repository;

	@GetMapping("/payment/{id}")
	public FinancialRecord getPaymentRecord(@PathVariable Long id) {
		
		Optional<FinancialRecord> paymentRecord = repository.findById(id);	 

		return paymentRecord.get();
	}
	
@PostMapping("/payment")
	public PaymentRecord savePaymentRecord(@RequestBody PaymentRecord paymentRecord) {
		
		PaymentRecord exchangeValue = repository.save(paymentRecord);	 

		return exchangeValue;
	}

	
	@GetMapping("/payment/list")
	public List<PaymentRecord> changePaymentRecord() {
		
		List<PaymentRecord> exchangeValue =  new ArrayList<PaymentRecord>();
		exchangeValue=(List<PaymentRecord>) repository.findAll();	 
		return exchangeValue;
	}

	@GetMapping("/payment/search/amount/{amount}")
	public PaymentRecord findPaymentRecordByAmount(@PathVariable Float amount) {
		Optional<PaymentRecord> paymentRecord = repository.findByAmount(amount);
		return paymentRecord.get();
	}

	@GetMapping("/payment/search/currency/{currency}")
	public List<PaymentRecord> findPaymentRecordByCurr(@PathVariable String currency) {
		List<PaymentRecord> paymentRecord = repository.findByCurrency(currency);
		return paymentRecord;
	}
	
}
