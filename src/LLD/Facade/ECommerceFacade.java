package LLD.Facade;

import LLD.Facade.Service.NotificationService;
import LLD.Facade.Service.OrderService;
import LLD.Facade.Service.PaymentService;
import LLD.Facade.Service.ShipService;

public class ECommerceFacade {
    private OrderService orderService;
    private PaymentService paymentService;
    private ShipService shipService;
    private NotificationService notificationService;

    public ECommerceFacade(OrderService orderService, PaymentService paymentService, ShipService shipService, NotificationService notificationService){
        this.orderService = orderService;
        this.shipService = shipService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void placeOrder(String productName){
        System.out.println("Placing order for "+productName);
        orderService.createOrder();
        System.out.println("Payment of order "+productName+" in progress");
        paymentService.orderPayment();
        System.out.println("Shipping order "+productName+" now");
        shipService.shipOrder();
        System.out.println("Check you phone for confirmation");
        notificationService.sendNotification(productName);
    }
}
