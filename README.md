# kubernetes

In the past, we used to develop applications as monoliths. The components  were tightly coupled, and they all ran in a single computer. Scaling the application vertically was possible but horizontally it wasn’t
According to the needs of applications (high availibility, increasing client numbers) monolith applications are divided into  small parts with responsibility of smaller teams. The configuration of these smaller programs were different and they were using different libraries.  So running the small applications together in a single operating system was not a choice.   Containers helped to solve this problem. Containerized application is an application which runs into a container.  Container image is an immutable static file  that includes all the necccessary files to run an application  inside a container.
It consist of layers. Think the operating system as a lightweight OS. Not all the commands are available we only need the commands that make our application run. For example we can  use alpine(minimal Linux distribution) 



ClusterIP : Default type Service is accessible from inside the cluster only.
NodePort : Service is accessible from outside the cluster. The default port ranges (30000–32767).
LoadBalancer : In addition to NodePort, it will also create an external load balance. 
ExternalName : Service is redirected to an external DNS name, by a DNS CNAME record.
