### Spring-Boot Kafka Es demo

#### 一、Kafka

>本地配置集群 host  不然 kafka 连接失败



#### 二、Es

>spring-boot Es 有个默认的 cluster-name，如果安装Es的时候改了名称，程序需要改一下
>
>>```java
>>Settings esSetting = Settings.builder()
>>        .put("cluster.name",clusterName)
>>        .put("node.name","node-1")
>>        .put("client.transport.sniff", false)//增加嗅探机制，找到ES集群
>>        .put("thread_pool.search.size", Integer.parseInt(poolSize))//增加线程池个数，暂时设为5
>>        .build();
>>```

