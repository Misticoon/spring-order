package com.lucas.order.services;

import com.lucas.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order){
        if (order.getBasic() < 100) {
            return 20;
        } else if (order.getBasic() < 200) {
            return 12;
        } else {
            return 0;
        }
    }
}
