## Day 1 - 24/07/26
- Installed Docker, kubectl, Minikube on M3 Mac
- Started Minikube cluster (v1.35.1) - Ready
- Deployed test nginx pod, exposed via NodePort, verified in browser
- Cleaned up test resources
- Decided: sample microservice = Spring Boot payment API with failure-simulation endpoint
 ## Day 3 - 9/8/26
- Pushed payment-service code to GitHub (Rajasree137/gitops-auto-healing-platform)
- Restructured repo: separated app code from k8s-manifests/ for GitOps
- Installed Argo CD on Minikube cluster
- Connected Argo CD to GitHub repo, created payment-service application
- Debugged: hidden tab character in repo URL, UI sync-status filter hiding app, port-forward/tunnel dying repeatedly on Mac sleep
- Confirmed GitOps sync working: Argo CD deployed payment-service from Git, verified /api/payment responding
- Switched to kubectl port-forward (stable localhost URL) instead of minikube service (random changing URL)