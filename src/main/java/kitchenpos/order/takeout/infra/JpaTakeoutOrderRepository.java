package kitchenpos.order.takeout.infra;

import java.util.UUID;
import kitchenpos.order.takeout.domain.TakeoutOrder;
import kitchenpos.order.takeout.domain.TakeoutOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTakeoutOrderRepository
    extends TakeoutOrderRepository, JpaRepository<TakeoutOrder, UUID> {}
