
ThisBuild / scalaVersion := "3.3.6"

enablePlugins()

lazy val root = (project in file("."))
  .settings(
    name := "HelloScalaSBT"
  )

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test,