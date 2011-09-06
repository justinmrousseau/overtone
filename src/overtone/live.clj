(ns overtone.live
  (:use [overtone.ns]
        [overtone.util lib])
  (:require clojure.stacktrace
            midi overtone.osc byte-spec
            [overtone.algo chance scaling]
            [overtone.sc.ugen.constants]
            [overtone.sc allocator core ugen node synth synthdef cgen
             trigger buffer envelope bus sample sc-lang example]
            [overtone.sc.cgen audio-in oscillators demand]
            [overtone.sc.examples demand osc trig compander audio-in]
            [overtone.music rhythm pitch tuning time]
            [overtone.studio core util fx]
            [overtone.viz scope]))

(immigrate
  'overtone.osc
  'midi
  'overtone.sc.ugen.constants
  'overtone.algo.chance
  'overtone.algo.scaling
  'overtone.sc.core
  'overtone.sc.node
  'overtone.sc.buffer
  'overtone.sc.trigger
  'overtone.sc.ugen
  'overtone.sc.synth
  'overtone.sc.sample
  'overtone.sc.synthdef
  'overtone.sc.envelope
  'overtone.sc.sc-lang
  'overtone.sc.bus
  'overtone.sc.cgen
  'overtone.sc.cgen.audio-in
  'overtone.sc.cgen.oscillators
  'overtone.sc.cgen.demand
  'overtone.sc.example
  'overtone.sc.examples.demand
  'overtone.sc.examples.osc
  'overtone.sc.examples.trig
  'overtone.sc.examples.compander
  'overtone.sc.examples.audio-in
  'overtone.music.rhythm
  'overtone.music.pitch
  'overtone.music.tuning
  'overtone.music.time
  'overtone.studio.core
  'overtone.studio.fx
  'overtone.viz.scope
 )

(defonce _auto-boot_ (boot))

(wait-until-connected)

(print-ascii-art-overtone-logo)
