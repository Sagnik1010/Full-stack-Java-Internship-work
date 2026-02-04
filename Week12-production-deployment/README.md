# Production-Ready DevOps Project

## Stack
- React, Spring Boot
- Docker, Kubernetes, Helm
- Terraform (AWS)
- GitHub Actions
- Prometheus, Grafana, Loki
- Trivy, Vault

## How to Run (Local)
1. Run backend: `cd backend/product-service && mvn spring-boot:run`
2. Run frontend: `cd frontend && npm start`
3. Dockerize both
4. Start minikube: `minikube start`
5. Deploy: `helm install product-service infrastructure/kubernetes/helm/product-service -n dev`
