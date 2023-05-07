
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
The user will be able to use CURL commands to place orders for either sneaker or cleats. Buyers can add shoes to their carts or delete them. Buyers can look at the inventory edited by the vendor to see what shoes are available. The buyer can check out to place their order and get a final total. The vendor is able to add shoes to the inventory or take shoes away. The shoeCatalog text file gives examples of cleats and sneakers to add to inventory/cart. 

## Curl Commands 
Below are the CURL commands that access the different features of the application. Localhost can be substituted for GKE cluster EXTERNAL_IP. Checkout service does not need to be CURLed as it is accessible through the Buyer service. 
### Buyer 
GET localhost:31000/buyer = retrieves user's cart

GET localhost:31000/buyer/inventory = retrieves inventory that is supplied via the vendor

GET localhost:31000/buyer/checkout (input credit card info) = calculates total price for cart and displays checkout info

POST localhost:31000/buyer (input shoe info) = adds shoe to cart 

DELETE localhost:31000/buyer  (input shoe info) = deletes shoe from cart

DELETE localhost:31000/buyer/deleteall  = deletes all shoes from cart

### Vendor 
GET localhost:32000/vendor = retrieves inventory of shoe store

POST localhost:32000/vendor (input shoe info) = adds shoe to inventory

DELETE localhost:32000/vendor (input shoe info) = deletes shoe from inventory


## Deployment instructions 
There are two bash shell scripts that will deploy the microservices and config map on to kubernetes using YAML files. These YAML files can be found in the "kubernetes" folder of the project. 
### Local Machine
If you would like to deploy on your local machine use the "deploy.sh" scipt. 
Download Using This Link: 
```sh
https://github.com/Keelymac32/CloudComputingProject/blob/main/deploy.sh
```

Once the file is on your local computer, in your local terminal execute the following command: 

```sh
chmod +x deploy.sh 
```
Then run the script using:

```sh
./deploy.sh 
```
This will clone the github repository on to your local computer and deploy the YAML files to kubernetes. 
This will deploy the entire suite of microservices to kubernetes on your local computer. 
### GKE Virtual Machine
If you would like to deploy on GKE then you can use the deployGKE.sh script to deploy the YAML files and create specific NodePort holes in the google GKE firewall to ensure that you can connect to the microservices. Use following command to execute the bash script.
First Clone the repo using this command:
```sh
git clone https://github.com/Keelymac32/CloudComputingProject
```
Then go into the CloudComputingProject Repo using:
```sh
cd CloudComputingProject
```
Now that you are in the directory you can execute the bash script using:

```sh
chmod +x deployGKE.sh
```
and then to run the bash script run the following command:
```sh
./deployGKE.sh
```
The buyer service is accessible through port 31000 and the vendor is accessible through port 32000
To find your GKE cluster EXTERNAL_IP use this command:
```sh
kubectl get nodes -o wide
```
Finally you can CURL the application in your browser using the cluster http://EXTERNAL_IP:31000/buyer or http://EXTERNAL_IP:32000/vendor
