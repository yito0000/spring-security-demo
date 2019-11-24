## spring-security-demo
* spring securityの使い方等の説明をするためのアプリ
* 説明については`etc/spring-securty.md`を参照
* marpを使って書いてあるので以下を実行すると見れる
```
docker run --rm --init -v $PWD:/home/marp/app -e LANG=$LANG -p 8080:8080 -p 37717:37717 marpteam/marp-cli -s .
```

* アプリの使い方
  * datasourceを`/etc/datasource/docker-compose.yml`を使って用意する
  * `./gradlew bootRun`で起動