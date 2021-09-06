name := "SBT-G4"

version := "0.1"

scalaVersion := "2.13.6"
lazy val common = project.in(file("common"))

  .settings(

    libraryDependencies += "org.scalastic" %% "scalastic" % "2.2.0-M1",
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "Test",
    libraryDependencies +="org.mockito" %% "mockito-scala" % "1.16.39" % "Test",






  )
lazy val rest = project.in(file("rest"))
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" %   "10.2.6",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.16",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.16",
    libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.2",
    libraryDependencies +="com.typesafe.akka" %% "akka-stream-testkit" % "2.6.16"% "Test",
    libraryDependencies +=  "com.typesafe.akka" %% "akka-http-testkit" %"10.2.6"%"Test",
    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.16"% "Test")
lazy val root = project.in(file(".")).aggregate(common, rest)
