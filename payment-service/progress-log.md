## Day 2 - 25/07/26 (completed)
- Built Spring Boot payment-service with /api/payment, /api/toggle-failure, /api/health
- Fixed port 8080 conflicts (local run vs Docker)
- Fixed package name mismatch bug (com.example.paymentservice vs com.example.payment_service) causing 404s
- Dockerized app (v1 → v2), tested locally and in Docker
- Loaded image into Minikube, deployed via deployment.yaml
- Verified all 3 endpoints working correctly in Kubernetes pod
- Learned: minikube service tunnel URLs are temporary and change on every restart
