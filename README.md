# Draw Editor Application Project

MICS J3 課題のレポート用　ドローエディタGUIアプリケーション

## 開発環境
- Gradle 7.4.2
- openjdk 8 (class file version 52.0)
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

## 機能（開発予定）
- 描画する図形の色を指定できる（選択式）
- 図形を描画できる（選択式）
  - 四角形
  - 円

(以下余裕があれば)
- 図形の保存と読み込み
- 図形の選択
- 図形の編集
  - 移動
  - 変形
  - 削除
  - 色の変更

## 設計方針
- アーキテクチャパターン：MVCモデル
- デザインパターン：Observerパターン, Bridgeパターン
- クラス構成・クラス図