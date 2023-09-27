
`settings` -> `editor` -> `Live Templates` -> `Java`

 ## Log method name and its arguments
```JAVA
log.info()
android.util.Log.d(TAG, $content$);

```
 - edit variables: 
```groovy
def params = _2.collect {it + ' = [\" + ' + it + ' + \"]'}.join(', '); return '\"' + _1 + '() called' + (params.empty  ? '' : ' with: ' + params) + '\"'", methodName(), methodParameters())
```

- change: Applicable in Java: statement.

## Log result of this method
```JAVA
log.info("end $CLASS_NAME$.$METHOD_NAME$() returned: " + $result$);
```
`METHOD_NAME` : `methodName()`
`result`: `variableOfType(methodReturnType())`
