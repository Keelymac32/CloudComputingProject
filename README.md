
# Keelyn's Shoe Store Micro-Service Web App

## Application Nature and Purpose
The nature of this application is  a web based athletic shoe store. There are two different users that can use this app, a vendor that is able to add and delete shoes in the inventory and a buyer who will be adding the shoes listed in the inventory to their cart then able to check out. The buyer will see a final description of their order as well as the final price. 
## Module Lay Out
![map](https://user-images.githubusercontent.com/91858712/236646005-5d24b7c3-fead-40bd-9918-e810be0b7768.jpg)


## Microservices and Connections
1. Buyer Microservice that allows users to see the shoe inventory, add shoes to their cart, delete their cart or
check out. This buyer service will connect with the vendor to bring up the inventory, and connect with the checkout service to get the cart total.  

2. Vendor Mircoservice that allows vendors to add shoes to their inventory or delete shoes.

3. Checkout Microserice that aids in summing the shoe prices in the cart and producing a total price. 

## Statement of the estimated languages and frameworks

Java and SpringBoot for Microservices

Postman for CURL commands

## General description of the UI with the primary actions
The user will be able to use CURL commands to place orders for either sneaker or cleats. Buyers can add shoes to their carts or delete them. Buyers can look at the inventory edited by the vendor to see what shoes are available. The buyer can check out to place their order and get a final total. The vendor is able to add shoes to the inventory or take shoes away.

## Deployment instructions 
There are two bash shell scripts that will deploy the microservices and config map on to kubernetes using YAML files. These YAML files can be found in the "kubernetes" folder of the project. 
### Local Machine
If you would like to deploy on your local machine use the "deploy.sh" scipt. In your local terminal run "chmod +x deploy.sh" followed by "./deploy.sh" This will clone the github repository on to your local computer and deploy the YAML files to kubernetes. 
This will deploy the entire suite of microservices to kubernetes on your local computer. 
### GKE Virtual Machine
If you would like to deploy on GKE then you can use the deployGKE.sh script to clone the github repository to your computer, then will deploy the YAML files and create specific NodePort holes in the google firewall to ensure that you can connect to the microservices. Use the commands
"chmod +x deployGKE.sh" and "./deployGKE.sh" to run application on GKE. 
