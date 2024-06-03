package kitchenpos.order.delivery.application;

import java.util.List;
import java.util.UUID;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.order.delivery.domain.DeliveryOrder;
import kitchenpos.order.delivery.domain.DeliveryOrderRepository;
import kitchenpos.order.delivery.domain.KitchenridersClient;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrderService {
  private final DeliveryOrderRepository orderRepository;
  private final MenuRepository menuRepository;
  private final KitchenridersClient kitchenridersClient;

  public DeliveryOrderService(
      final DeliveryOrderRepository orderRepository,
      final MenuRepository menuRepository,
      final KitchenridersClient kitchenridersClient) {
    this.orderRepository = orderRepository;
    this.menuRepository = menuRepository;
    this.kitchenridersClient = kitchenridersClient;
  }

  public DeliveryOrder create(DeliveryOrder request) {
    return null;
  }

  public DeliveryOrder accept(UUID orderId) {
    return null;
  }

  public DeliveryOrder serve(UUID orderId) {
    return null;
  }

  public DeliveryOrder startDelivery(UUID orderId) {
    return null;
  }

  public DeliveryOrder completeDelivery(UUID orderId) {
    return null;
  }

  public DeliveryOrder complete(UUID orderId) {
    return null;
  }

  public List<DeliveryOrder> findAll() {
    return null;
  }
}
