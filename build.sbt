ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

enablePlugins()

lazy val root = (project in file("."))
  .settings(
    name := "HelloScalaSBT"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
