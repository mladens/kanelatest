
scalaVersion := "2.13.0"

name := "Functions-SDK"

version := "1.0"

scalaVersion := "2.12.4"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.5.23"
  val akkaHttpV = "10.0.9"
  Seq(
    "com.rabbitmq" % "amqp-client" % "4.2.0",
    "com.typesafe.akka" % "akka-slf4j_2.12" % akkaV,
    "com.typesafe.akka" % "akka-actor_2.12" % akkaV,
    "com.typesafe.akka" % "akka-remote_2.12" % akkaV,
    "com.typesafe.akka" % "akka-cluster_2.12" % akkaV,
    "com.typesafe.akka" % "akka-cluster-metrics_2.12" % akkaV,
    "com.typesafe.akka" % "akka-cluster-tools_2.12" % akkaV,
    "com.typesafe.akka" % "akka-contrib_2.12" % akkaV,
    "com.typesafe.akka" % "akka-testkit_2.12" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV,
    "com.github.romix.akka" %% "akka-kryo-serialization" % "0.5.2",
    "com.typesafe.play" %% "play-json" % "2.6.9",
    "io.spray" %% "spray-json" % "1.3.3",
    "com.sclasen" %% "akka-zk-cluster-seed" % "0.1.10"
  )
}

libraryDependencies += "io.kamon" %% "kamon-bundle" % "2.0.1"
libraryDependencies += "io.kamon" %% "kamon-apm-reporter" % "2.0.0"

