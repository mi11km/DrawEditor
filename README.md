# Draw Editor Application Project

MICS J3 課題のレポート用ドローエディタアプリケーション

## 開発環境
- Gradle 7.4.2
- openjdk 18.0.1.1
- IntelliJ IDEA(エディタ)

アプリケーションのエントリーポイントは`app/src/main/java/DrawEditor/App.java`

## 実行
```shell
./gradlew run
```

## テスト
```shell
./gradlew test 
```

## ビルド
```shell
./gradlew build 
```
`app/build/`配下にビルドされたファイル群が吐出されます

### ビルド後の`.jar`ファイルの実行
```shell
java -jar ./app/build/libs/app.jar
```

## 機能

## 設計方針
