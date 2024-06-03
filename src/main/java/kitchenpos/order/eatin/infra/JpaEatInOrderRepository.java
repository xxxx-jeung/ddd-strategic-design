package kitchenpos.order.eatin.infra;

import java.util.UUID;
import kitchenpos.order.eatin.domain.EatInOrder;
import kitchenpos.order.eatin.domain.EatInOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEatInOrderRepository
    extends EatInOrderRepository, JpaRepository<EatInOrder, UUID> {}
