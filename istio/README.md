# Kubernetes

istioctl install --set profile=demo -y
kubectl label namespace default istio-injection=enabled


minikube addons list 
minikube addons enable metallb
minikube addons configure metallb

http://192.168.0.26

-- Enter Load Balancer Start IP: 192.168.0.26
-- Enter Load Balancer End IP: 192.168.0.41


kubectl port-forward service/kiali 20001:20001 -n istio-system
kubectl port-forward service/prometheus 9090:9090 -n istio-system
kubectl port-forward service/grafana 3000:3000 -n istio-system
