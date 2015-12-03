name := "PlayThriftBoilterplate"

version := "1.0"

lazy val `playthriftboilterplate` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
  "mandubian maven bintray" at "http://dl.bintray.com/mandubian/maven")

libraryDependencies ++= Seq(
  jdbc ,
  cache ,
  ws   ,
  specs2 % Test,
  //Apache Thrift, Scrooge, Finagle
  "org.apache.thrift" % "libthrift" % "0.9.2",
  "com.twitter" %% "finagle-http" % "6.24.0",
  "com.twitter" %% "finagle-thrift" % "6.30.0",
  "com.twitter" %% "scrooge-core" % "4.2.0"
  )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled") ++
  scala.util.Properties.envOrNone("PF_CONF").toSeq

// enable higherKinds to remove warnings from scrooge-generated code that higher-kinded type should be enabled
scalacOptions ++= Seq("-feature", "-language:reflectiveCalls", "-language:higherKinds")

lazy val thrift = (project.in(file("thrift")))
  .settings(
    scroogeThriftSourceFolder in Compile <<= baseDirectory,
    scroogeThriftOutputFolder in Compile <<= baseDirectory {
      base => base
    }
  )
