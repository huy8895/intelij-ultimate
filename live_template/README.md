
- change: Applicable in Java: statement.

## Log result of this method
```JAVA
log.info("end $CLASS_NAME$.$METHOD_NAME$() returned: {}", Utils.toJson($result$));
```
`METHOD_NAME` : `methodName()`
`result`: `variableOfType(methodReturnType())`


1. Mở IntelliJ và điều hướng đến **File > Settings > Editor > Live Templates**.
2. Tìm đến template `logm` của bạn.
3. Thay đổi expression của biến `content` thành: 

```groovy
groovyScript("
def params = _2.collect {it}.join(', ');
def placeholders = _2.collect {'{}'}.join(', ');
return '\"' + _1 + '() called' +
(params.empty  ? '' : ' with: ' + placeholders) + '\", '
+ params",
methodName(),
methodParameters()).replaceAll(', $', '')
```

4. Nhấn **Apply** và **OK** để lưu thay đổi.

Bây giờ, khi bạn sử dụng phím tắt `logm`, IntelliJ sẽ tạo ra một log message :

```java
log.info("getOrderById() called with: {}, {}", orderId, key);
```

