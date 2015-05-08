
scalaVersion := "2.11.6"

lazy val root = (project in file(".")).
  aggregate(util, core)

lazy val util = project

lazy val core = project


