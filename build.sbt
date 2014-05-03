organization := "org.virtuslab"

name := "play-slick-configuration"

version := "1.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "2.0.1",
  "com.typesafe.play" %% "play-slick" % "0.6.0.1",
  "org.scalatest" %% "scalatest" % "2.1.5" % "test",
  "com.typesafe.play" %% "play-test" % "2.2.2" % "test",
  "com.h2database" % "h2" % "1.3.175" % "test"
)

incOptions := incOptions.value.withNameHashing(true)