package com.myproject.pick_market.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    ShippingRepository  shippingRepository;

    //Add new shipment
    @Override
    public Shipping save(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    //view shipment details
    public List<Shipping> getAllShipping() {
        return shippingRepository.findAll();
    }
}
