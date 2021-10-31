package bits.pilani.financial.record;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface FinancialRecordRepository extends CrudRepository<FinancialRecord, Long> {
	
	public Optional<FinancialRecord> findById(Long id);
	public Optional<FinancialRecord> findByAmount(float amount);
	public List<FinancialRecord> findByCurrency(String currency);
	
}
