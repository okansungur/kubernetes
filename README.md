# Kubernetes

Read the article at :
https://okansungur.medium.com/quick-start-kubernetes-k8s-with-docker-desktop-9c4437988b72




- liveness probe =>  check whether the application is running as expected and if not, thecontainer is restarted. 
- readiness probe  =>  check whether an application is up but also ready to accept traffic. 
- start up probe  =>  checks application has started.

###### Kubernetes deployment strategies
- Recreate
- Rolling update (with zero downtime)
- Blue/Green (two versions of the deployment running Green is the new one)
- Canary (90% Blue & 10% Green)
-
