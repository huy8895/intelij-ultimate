## Log method name and its arguments
`settings` -> `editor` -> `Live Templates` -> `Java`
 
```JAVA
log.info()
android.util.Log.d(TAG, $content$);

```
 - edit variables: 
```groovy
 groovyScript("def params = _2.collect {it + ' = [\" + ' + it + ' + \"]'}.join(', '); return '\"' + _1 + '() called' + (params.empty  ? '' : ' with: ' + params) + '\"'", methodName(), methodParameters())
```

- change: Applicable in Java: statement.
