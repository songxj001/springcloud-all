服务发现注册 eureka-server : 8761
订单微服务：order-server : 8762   order-server
用户微服务：user-server : 8763 user-server
路由网关：zuul-server : 8764
web : web-server : 8765


feign:
  hystrix:
    enabled: true #开启断路器