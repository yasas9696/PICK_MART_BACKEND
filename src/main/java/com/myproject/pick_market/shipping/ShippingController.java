package com.myproject.pick_market.shipping;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/shipping")
public class ShippingController {

    @Autowired
    ShippingService shippingService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new Shipment
    @RequestMapping(value = "/newShipping")
    public Shipping save(@RequestBody Shipping shipping) {
        Shipping shippingSave = shippingService.save(shipping);
        log.info("Shipment Added, SHIPPING_ID : {} ", shippingSave.getShippingId());

        return shippingSave;
    }


    //Get all Shipment details
    @RequestMapping(value = "/getAll")
    public List<Shipping> getShipment() {
        return shippingService.getAllShipping();
    }


}
