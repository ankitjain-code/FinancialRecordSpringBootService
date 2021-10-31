package bits.pilani.financial.record;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public FinancialRecord savePaymentRecord(@RequestBody FinancialRecord paymentRecord) {

		FinancialRecord exchangeValue = repository.save(paymentRecord);

		return exchangeValue;
	}

	@GetMapping("/payment/list")
	public List<FinancialRecord> changePaymentRecord() {

		List<FinancialRecord> exchangeValue = new ArrayList<FinancialRecord>();
		exchangeValue = (List<FinancialRecord>) repository.findAll();
		return exchangeValue;
	}

	@GetMapping("/payment/search/amount/{amount}")
	public FinancialRecord findPaymentRecordByAmount(@PathVariable Float amount) {
		Optional<FinancialRecord> paymentRecord = repository.findByAmount(amount);
		return paymentRecord.get();
	}

	@GetMapping("/payment/search/currency/{currency}")
	public List<FinancialRecord> findPaymentRecordByCurr(@PathVariable String currency) {
		List<FinancialRecord> paymentRecord = repository.findByCurrency(currency);
		return paymentRecord;
	}

}
