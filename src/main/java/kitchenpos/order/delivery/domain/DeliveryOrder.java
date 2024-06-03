package kitchenpos.order.delivery.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import kitchenpos.order.OrderType;

@Table(name = "orders")
@Entity
public class DeliveryOrder {
  @Column(name = "id", columnDefinition = "binary(16)")
  @Id
  private UUID id;

  @Column(name = "type", nullable = false, columnDefinition = "varchar(255)")
  @Enumerated(EnumType.STRING)
  private OrderType type;

  @Column(name = "status", nullable = false, columnDefinition = "varchar(255)")
  @Enumerated(EnumType.STRING)
  private DeliveryOrderStatus status;

  @Column(name = "order_date_time", nullable = false)
  private LocalDateTime orderDateTime;

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(
      name = "order_id",
      nullable = false,
      columnDefinition = "binary(16)",
      foreignKey = @ForeignKey(name = "fk_order_line_item_to_orders"))
  private List<DeliveryOrderLineItem> orderLineItems;

  @Column(name = "delivery_address")
  private String deliveryAddress;

  public DeliveryOrder() {}

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public DeliveryOrderStatus getStatus() {
    return status;
  }

  public void setStatus(DeliveryOrderStatus status) {
    this.status = status;
  }

  public LocalDateTime getOrderDateTime() {
    return orderDateTime;
  }

  public void setOrderDateTime(LocalDateTime orderDateTime) {
    this.orderDateTime = orderDateTime;
  }

  public List<DeliveryOrderLineItem> getOrderLineItems() {
    return orderLineItems;
  }

  public void setOrderLineItems(List<DeliveryOrderLineItem> orderLineItems) {
    this.orderLineItems = orderLineItems;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }
}
