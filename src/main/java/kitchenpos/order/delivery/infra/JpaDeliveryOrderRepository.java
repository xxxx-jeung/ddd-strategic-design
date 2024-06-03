package kitchenpos.order.delivery.infra;

import java.util.UUID;
import kitchenpos.order.delivery.domain.DeliveryOrder;
import kitchenpos.order.delivery.domain.DeliveryOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDeliveryOrderRepository
    extends DeliveryOrderRepository, JpaRepository<DeliveryOrder, UUID> {}
