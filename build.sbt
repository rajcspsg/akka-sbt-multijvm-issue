import com.typesafe.sbt.SbtMultiJvm
import com.typesafe.sbt.SbtMultiJvm.MultiJvmKeys.MultiJvm

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

val akkaVersion = "2.6.18"

lazy val root = (project in file("."))
  .settings(
    name := "akka-sbt-multijvm-issue"
  )

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion,
"com.typesafe.akka" %% "akka-stream" % akkaVersion,
 "com.typesafe.akka" %% "akka-cluster" % akkaVersion)

