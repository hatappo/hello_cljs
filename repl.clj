(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

; 最初に1度ビルドする
(cljs.build.api/build "src"
  {:main 'hello-world.core
   :output-to "out/main.js"
   :verbose true})

; ブラウザREPLを起動する。
(cljs.repl/repl (cljs.repl.browser/repl-env)
  :watch "src"
  :output-dir "out")
