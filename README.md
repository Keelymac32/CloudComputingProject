
# Keelyn's Shoe Store Micro-Service Web App

## Application Nature and Purpose
The nature of this application will be a web based athletic shoe store. There will be two different users, a vendor that is able to add and take off shoes to the inventory and a buyer who will be adding the shoes to their cart then able to check out.       

## Module Lay Out

## Microservices and Connections
1. Buyer Microservice that allows users to see the shops inventory, add shoes to their cart, delete their cart or
check out. This buyer service will connect with the vendor to bring up the inventory, and connect with the checkout service to get the cart total.  

2. Vendor Mircoservice that allows users to add shoes to their inventory or delete shoes.

3. Checkout Microserice that aids in adding the shoes in the cart and producing a total. 

## Statement of the estimated languages and frameworks

Java and SpringBoot for Microservices

Postman for CURL commands

## General description of the UI with the primary actions
The user will be able to use CURL commands place orders for either sneaker or cleats. Users can add shoes to their carts by looking at the inventory edited by the vendor. When the order is place the order info will be displayed. The vendor is able to add shoes to the inventory or take shoes away.

##Deployment instructions 
