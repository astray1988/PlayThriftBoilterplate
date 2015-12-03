logLevel := Level.Warn

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "twitter-repo" at "https://maven.twttr.com")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.4")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "4.1.0")

//enable the server-side precompilation from JSX to js
addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.5.2")