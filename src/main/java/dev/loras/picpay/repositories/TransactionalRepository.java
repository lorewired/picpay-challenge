package dev.loras.picpay.repositories;

import dev.loras.picpay.domain.transactional.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionalRepository extends JpaRepository<Transaction, UUID> {

}
