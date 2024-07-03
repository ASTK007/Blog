

V部落是一个多用户博客管理平台，采用Vue+SpringBoot开发，现修改为springcloud微服务架构。




# 技术栈  

## 后端技术栈

后端主要采用了：  

1.SpringBoot  
2.SpringSecurity  
3.MyBatis  
4.springcloud  
5.Redis 
6.MySQL

## 前端技术栈

前端主要采用了：  

1.Vue  
2.axios  
3.ElementUI  
4.vue-echarts  
5.mavon-editor  
6.vue-router  

还有其他一些琐碎的技术我就不在这里一一列举了。   

# 快速运行

**本地运行**

1、在本地启动nacos、mysql

2、将init文件夹中的vueblog.sql导入数据库；redis.conf覆盖redis配置，启动redis

3、修改源码中的配置文件与组件对应

4、在IDE中编译运行项目

**使用docker-compose部署**

1、修改项目配置文件中host与虚拟机地址对应

2、使用maven打包项目，运行命令

```
mvn clean package
```

3、进入项目根目录，运行命令

```
#编译项目
docker-compose build
#启动项目
docker-compose up -d
#移除项目
docker-compose down
```


# 项目依赖  

1.[vue-echarts](https://github.com/Justineo/vue-echarts)  
2.[mavonEditor](https://github.com/hinesboy/mavonEditor)  
