package com.online.restaurant;

import java.sql.SQLOutput;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer Shruti = new Customer();

        Shruti.setName("Shruti");
        Shruti.setCity("Nagpur");
        Shruti.setAddress("New Nandanvan, Nagpur");
        Shruti.setState("Maharashtra");
        Shruti.setEmailId("jk@gmail.com");
        Shruti.setPhoneNumber(9567382013L);

        System.out.println("Vendor Details:");
        System.out.println("Name : "+ Shruti.getName());
        System.out.println("City : " + Shruti.getCity());
        System.out.println("Address :" + Shruti.getAddress());
        System.out.println("State:" + Shruti.getState());
        System.out.println("EmailID:" + Shruti.getEmailId());
        System.out.println("Phone Number:" + Shruti.getPhoneNumber());


        Vendor KGF = new Vendor();
        KGF.setName("KGF RESTAURANT");
        KGF.setAddress("chai chaupati");
        KGF.setCategory("nonveg");
        KGF.setRating(5.0);
        KGF.setState("Maharashtra");
        KGF.setCity("Nagpur");
        KGF.setPhoneNumber(8765430987L);


        Order order = new Order();
        order.setCustomer(Shruti);
        order.setVendor(KGF);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("KDK Girls Hostel");

        System.out.println("Order Details: ");
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println();

    }
}








