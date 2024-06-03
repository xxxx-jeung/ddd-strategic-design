package kitchenpos.order.eatin.infra;

import java.util.UUID;
import kitchenpos.order.eatin.domain.OrderTable;
import kitchenpos.order.eatin.domain.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderTableRepository
    extends OrderTableRepository, JpaRepository<OrderTable, UUID> {}
