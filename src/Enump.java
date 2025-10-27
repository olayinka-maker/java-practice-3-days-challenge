enum OrderStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
};


public class Enump {

    int orderId;
    OrderStatus status;


    public Enump(int orderId, OrderStatus status){

        this.orderId = orderId;
        this.status = status;
    }

    public void checkStatus(){
        System.out.println(" your " + orderId + " is " + "and it's currently "+ status);

    }

}
