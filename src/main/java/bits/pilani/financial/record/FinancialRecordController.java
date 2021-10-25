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
	
	
	
}