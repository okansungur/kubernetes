# kubernetes

In the past, we used to develop applications as monoliths. The components were tightly coupled, and they all ran in a single computer. Scaling the application vertically was possible, but it wasn't on horizontally.
According to the needs of applications (high availability, increasing client numbers) monolith applications were divided into smaller parts, with the responsibility of smaller teams. The configuration of these smaller programs was different and use different libraries. So running the small applications together in a single operating system was not a choice. Containers helped us to solve this problem. Containerized application is an application that runs into a container. A container image is an immutable static file that includes all the necessary files, to run an application inside a container. 
Container Image
