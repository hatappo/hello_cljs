(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:output-to "out/main.js"
   ; :main 'hello-world.core  ; 不要
   :optimizations :advanced}) ; 最適化のレベルをadvancedに。

(System/exit 0)
