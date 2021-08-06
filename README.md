
1) Service Registry: http://localhost:8761/
2) Cloud Gateway : 
3) Cloud Config Server :
4) Order Service:
5) Payment service
6) Hystrix Dashboard :  http://localhost:9195/hystrix

#H2 DB URL (JDBC URL:): In a service startup log, find "H2 console available at '/h2-console'. Database available at"

Order service: http://localhost:9192/h2-console
Payment service: http://localhost:9191/h2-console

# spring-cloud-gateway-hystrix


API-GateWay
-----------

URL : http://localhost:8989/order/bookOrder
HTTP Method : POST
```
Json Request :
```json
{
	"order":{
		"id":101,
		"name":"Smart TV",
		"qty":1,
		"price":22000
		
	},
	"payment":{}
}

Json Response :
json
{
    "order": {
        "id": 101,
        "name": "Smart TV",
        "qty": 1,
        "price": 22000
    },
    "amount": 22000,
    "transactionId": "9a021fa6-2061-4332-bdb7-b1358b3430c2",
    "message": "payment processing successful and order placed"
}

```
```bash
URL : http://localhost:8989/payment/101
HTTP Method : GET
```
Json Response :
```json
{
    "paymentId": 1,
    "transactionId": "d86cfeca-0b26-455e-a1a2-ac3e53707829",
    "orderId": 101,
    "paymentStatus": "SUCCESS",
    "amount":22000
}
```
