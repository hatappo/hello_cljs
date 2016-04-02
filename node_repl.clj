(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(cljs.build.api/build "src"
  {:main 'hello-world.core
   :output-to "out/main.js"
   :verbose true})

; ここを cljs.repl.browser/repl-env から cljs.repl.node/repl-env に変更しただけ。
(cljs.repl/repl (cljs.repl.node/repl-env)
  :watch "src"
  :output-dir "out")
