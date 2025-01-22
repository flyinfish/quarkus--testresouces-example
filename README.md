# testresouces-example

https://quarkusio.zulipchat.com/#narrow/channel/187030-users/topic/.40WithTestResource.28.2E.2E.2C.20scope.3DMATCHING_RESOURCES.29

```
git clone https://github.com/flyinfish/quarkus--testresouces-example.git
cd quarkus quarkus--testresouces-example
```

## 5 times `Profile test activated`

```
mvn test
quarkus mvn:test
```

## 2 times `Profile test activated`

uncomment all `@TestProfile(KafkaProfile.class)`
```
mvn test
quarkus mvn:test
```

## once only `Profile test activated`

re-comment all `@TestProfile`
uncomment all ` //, scope = TestResourceScope.GLOBAL)`
```
mvn test
quarkus mvn:test
```
