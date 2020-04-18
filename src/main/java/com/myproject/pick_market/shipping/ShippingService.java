package com.myproject.pick_market.shipping;

import java.util.List;

public interface ShippingService {

    Shipping save(Shipping shipping);

    List<Shipping> getAllShipping();
}
