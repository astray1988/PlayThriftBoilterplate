logLevel := Level.Warn

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "twitter-repo" at "https://maven.twttr.com")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.4")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "4.1.0")