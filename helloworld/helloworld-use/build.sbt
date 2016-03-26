

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    organization := "org.example",
    name := "helloword-use",
    version := "1.0",
    scalaVersion := "2.11.8"
    //commands ++= Seq(Main.hello)
  )


libraryDependencies += "org.example" %% "hello" % "0.1-SNAPSHOT"

lazy val commonSettings = Seq(
  scalaVersion := "2.11.8"
)
