package kitchenpos.order.eatin.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import kitchenpos.order.OrderType;

@Table(name = "orders")
@Entity
public class EatInOrder {
  @Column(name = "id", columnDefinition = "binary(16)")
  @Id
  private UUID id;

  @Column(name = "type", nullable = false, columnDefinition = "varchar(255)")
  @Enumerated(EnumType.STRING)
  private OrderType type;

  @Column(name = "status", nullable = false, columnDefinition = "varchar(255)")
  @Enumerated(EnumType.STRING)
  private EatInOrderStatus status;

  @Column(name = "order_date_time", nullable = false)
  private LocalDateTime orderDateTime;

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(
      name = "order_id",
      nullable = false,
      columnDefinition = "binary(16)",
      foreignKey = @ForeignKey(name = "fk_order_line_item_to_orders"))
  private List<EatInOrderLineItem> orderLineItems;

  @ManyToOne
  @JoinColumn(
      name = "order_table_id",
      columnDefinition = "binary(16)",
      foreignKey = @ForeignKey(name = "fk_orders_to_order_table"))
  private OrderTable orderTable;

  @Transient private UUID orderTableId;

  public EatInOrder() {}

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

  public EatInOrderStatus getStatus() {
    return status;
  }

  public void setStatus(EatInOrderStatus status) {
    this.status = status;
  }

  public LocalDateTime getOrderDateTime() {
    return orderDateTime;
  }

  public void setOrderDateTime(LocalDateTime orderDateTime) {
    this.orderDateTime = orderDateTime;
  }

  public List<EatInOrderLineItem> getOrderLineItems() {
    return orderLineItems;
  }

  public void setOrderLineItems(List<EatInOrderLineItem> orderLineItems) {
    this.orderLineItems = orderLineItems;
  }

  public OrderTable getOrderTable() {
    return orderTable;
  }

  public void setOrderTable(OrderTable orderTable) {
    this.orderTable = orderTable;
  }

  public UUID getOrderTableId() {
    return orderTableId;
  }

  public void setOrderTableId(UUID orderTableId) {
    this.orderTableId = orderTableId;
  }
}
