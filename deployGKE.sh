#!/bin/bash
git clone https://github.com/Keelymac32/CloudComputingProject
cd CloudComputingProject
kubectl apply -f kubernetes
gcloud compute firewall-rules create firewall-for-gke31 --allow tcp:31000
gcloud compute firewall-rules create firewall-for-gke32 --allow tcp:3100
gcloud compute firewall-rules create firewall-for-gke311 --allow tcp:31001
kubectl get all 