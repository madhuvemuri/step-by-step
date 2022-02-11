How to apply
----------------
_**Note**: If you ar using minikube you need to start tunnel to access  cluster from outside_

`minikube tunnel`

1) `mvn clean install`
2) `docker build -t logging-demo .`
3) `docker tag logging-demo dockerrepo-name/logging-demo`
4) `docker push dockerrepo-name/logging-demo` (The push refers to docker repository ) 
5) `kubectl apply -f demo.yaml`
6) `kubectl get pods -n`
   ![](../../../../../Desktop/Screen Shot 2022-02-10 at 7.23.45 PM.png)
7) Need to access the curl from laptop cli using EXTERNAL-IP (forward request)

    [http://localhost:8080/info]()
