(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'hello-world.core    ; エントリポイントを追記
                       :output-to "out/main.js"})
