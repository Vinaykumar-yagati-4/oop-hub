package com.java.oop.stringassignment;

public class Order {
    long orderId;
    String orderDate;
    String orderStatus;
    boolean isCancellable;
    boolean isReturnable;
    long trackingId;
    String deliveryType;
    String estimatedDeliveryDate;

    public Order() {
        orderId = 100012345L;
        orderDate = " 17-4-2026";
        orderStatus = "confirmed";
        isCancellable = true;
        isReturnable = true;
        trackingId = 12909090546L;
        deliveryType = "Express";
        estimatedDeliveryDate = "20-4-2026";
    }

    public Order(long orderId, String orderDate, String orderStatus, boolean isCancellable, boolean isReturnable, long trackingId, String deliveryType, String estimatedDeliveryDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.isCancellable = isCancellable;
        this.isReturnable = isReturnable;
        this.trackingId = trackingId;
        this.deliveryType = deliveryType;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
