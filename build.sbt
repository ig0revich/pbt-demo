val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "property-based-testing-demo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % "test"
  )
