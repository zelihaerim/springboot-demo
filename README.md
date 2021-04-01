# springboot-demo <br>
I have coded basci spring boot back-end project. <br>
I have tried run the project on docker. <br>
There is some commands and image: <br>
![docker imges](https://user-images.githubusercontent.com/23221280/113321510-576c1300-931c-11eb-99a4-8c6590b66dfa.PNG)
<br>
![commandbir](https://user-images.githubusercontent.com/23221280/113321515-589d4000-931c-11eb-81ca-2cf81feb0ab6.PNG)
<br>
This is local some host result when fetching datas from mysql workbench <br>
![local1](https://user-images.githubusercontent.com/23221280/113321517-589d4000-931c-11eb-85a8-ecf6fe11d331.PNG)
<br>
This is local some host result when fetching datas from mysql workbench <br>
![local2](https://user-images.githubusercontent.com/23221280/113321520-5935d680-931c-11eb-972f-2b7a7abb0c20.PNG)
<br>
This is docker log for spring boot project <br>
![spring yazisi](https://user-images.githubusercontent.com/23221280/113321530-5a670380-931c-11eb-86a9-498aa5526a13.PNG)
<br>
But when I run my project image which converted from .jar file by using mysql container, it failed because of connection error :/ <br>
![failure](https://user-images.githubusercontent.com/23221280/113321527-59ce6d00-931c-11eb-9f77-8ddcd1adc311.PNG)
<br>

I have used some docker commnads, examples:  <br>
docker logs docker-spring-boot  <br>
docker run -p 8080:8080 --name docker-spring-boot --link mysql-standaloneiki:mysql/mysql-server -d docker-spring-boot  <br>
docker run --name mysql-standaloneiki -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=first -e MYSQL_PASSWORD=root -d mysql/mysql-server:5.6  <br>
I have watched this video for spring boot docker. <br>
https://www.youtube.com/watch?v=fvEWoy1xOvo&ab_channel=TechPrimers
