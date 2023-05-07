#!/bin/bash
git clone https://github.com/Keelymac32/CloudComputingProject
cd CloudComputingProject
kubectl apply -f kubernetes 
kubectl get all