package bits.pilani.financial.record;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface FinancialRecordRepository extends CrudRepository<FinancialRecord, Long> {
	
	public Optional<FinancialRecord> findById(Long id);
	
	
}
