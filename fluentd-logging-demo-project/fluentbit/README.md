How to apply
----------------
_**Note**: If you ar using minikube you need to start tunnel to access  cluster from outside_

`minikube tunnel`

1) `kubectl apply -f ns.yaml` (Namespace efk created)

2) `kubectl apply -f fluentbit.yaml `(fluentbit deamonset created efk created)

3) Check pod is created and running

     `get po -o wide -n fluent-bit-logging`
	 
        NAME               READY   STATUS    RESTARTS   AGE   IP             NODE       NOMINATED NODE   READINESS GATES

        fluent-bit-wt6wk   1/1     Running   0          38m   192.168.49.2   minikube   <none>           <none>
	  
4) `minikube ssh	 `

     `curl -s http://192.168.49.2:2020  (You see some json as respo)`

    ` exit`

    `kubectl get nodes -o wide`

       NAME       STATUS   ROLES                  AGE    VERSION   INTERNAL-IP    EXTERNAL-IP   OS-IMAGE             KERNEL-VERSION     CONTAINER-RUNTIME
   
       minikube   Ready    control-plane,master   6d8h   v1.23.1   192.168.49.2   <none>        Ubuntu 20.04.2 LTS   5.10.76-linuxkit   docker://20.10.12


6) Need to access the curl from laptop cli using EXTERNAL-IP

      `curl -s http://<EXTERNAL-IP>:80`


7) Curl command for HTTP request to send log in json format

   `curl -d @test.json -XPOST -H "content-type: application/json" http://localhost:9888/test.json`
