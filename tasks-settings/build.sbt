lazy val root = (project in file(".")).
  settings(
    organization := "zoosky",
    version := "0.1.0",
    scalaVersion := "2.11.8",
    hello := { println("Hello from Task!")}

  )

lazy val hello = taskKey[Unit]("A examle task")
