package kitchenpos.order.eatin.application;

import java.util.List;
import java.util.UUID;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.order.delivery.domain.KitchenridersClient;
import kitchenpos.order.eatin.domain.EatInOrder;
import kitchenpos.order.eatin.domain.EatInOrderRepository;
import kitchenpos.order.eatin.domain.OrderTableRepository;
import org.springframework.stereotype.Service;

@Service
public class EatInOrderService {
  private final EatInOrderRepository orderRepository;
  private final MenuRepository menuRepository;
  private final KitchenridersClient kitchenridersClient;
  private final OrderTableRepository orderTableRepository;

  public EatInOrderService(
      EatInOrderRepository orderRepository,
      MenuRepository menuRepository,
      KitchenridersClient kitchenridersClient,
      OrderTableRepository orderTableRepository) {
    this.orderRepository = orderRepository;
    this.menuRepository = menuRepository;
    this.kitchenridersClient = kitchenridersClient;
    this.orderTableRepository = orderTableRepository;
  }

  public EatInOrder create(EatInOrder request) {
    return null;
  }

  public EatInOrder accept(UUID orderId) {
    return null;
  }

  public EatInOrder serve(UUID orderId) {
    return null;
  }

  public EatInOrder complete(UUID orderId) {
    return null;
  }

  public List<EatInOrder> findAll() {
    return null;
  }
}
