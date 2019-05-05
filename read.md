# 				技术栈积累

​	**序言：每个人原本是一样的，只可是每个在人生轨迹中一直在完成自我实现才变得不一样，真正的英雄是战胜自己，完成自我实现！可能一直这样搬砖也不是办法，不如通过写技术栈总结来推动自己不断学习。该项目本意是写一些现实项目中经常用到的技术，框架总结，并配上一些小demo来巩固自己的理解。其中最重要的架构是springboot，关于其他技术栈会在学习过程中不断完善。遇到一些重要的技术，会专门写一个总结文件来叙述！**

### 一、如何在idea中集成git，并且将项目上传到github上面去

1.intelliJ idea 中集成git插件，只需要在idea上选择git.exe路径，并将ssh executable 选择本地则可（具体演示跳过），而在idea中配置github，则需要填写host(github.com) ,login(账号)，password(密码) ，并勾选 clone git repositories using ssh （具体演示跳过），这样就完成git 和github的配置

2.在需要上传github的项目中，使用 git bash 执行

​	git init  --将该项目所在文件夹被当做git 本地仓库

​	git add .  -- 暂存

​	git commit -m '' --提交

​	git remote add origin   xxxxx   -- 与github远程仓库建立连接  

​	git push -u origin master  -- 将本地文件推送到 github远程仓库的master分支上