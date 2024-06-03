package kitchenpos.order.takeout.application;

import java.util.List;
import java.util.UUID;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.order.takeout.domain.TakeoutOrder;
import kitchenpos.order.takeout.domain.TakeoutOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class TakeoutOrderService {
  private final TakeoutOrderRepository orderRepository;
  private final MenuRepository menuRepository;

  public TakeoutOrderService(
      TakeoutOrderRepository orderRepository, MenuRepository menuRepository) {
    this.orderRepository = orderRepository;
    this.menuRepository = menuRepository;
  }

  public TakeoutOrder create(TakeoutOrder request) {
    return null;
  }

  public TakeoutOrder accept(UUID orderId) {
    return null;
  }

  public TakeoutOrder serve(UUID orderId) {
    return null;
  }

  public TakeoutOrder complete(UUID orderId) {
    return null;
  }

  public List<TakeoutOrder> findAll() {
    return null;
  }
}
