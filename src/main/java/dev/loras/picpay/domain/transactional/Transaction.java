package dev.loras.picpay.domain.transactional;

import dev.loras.picpay.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;
    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
