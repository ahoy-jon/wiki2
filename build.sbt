
name := "Wiki"

version := "1.0"

scalaVersion := "2.9.0-1"

seq(WebPlugin.webSettings: _*)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "6.0.1",
	"org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
	"javax.servlet" % "servlet-api" % "2.5" % "provided->default",
	"com.vaadin" % "vaadin" % "6.4.0"            
)

libraryDependencies ++= Seq( 
		"junit" % "junit" % "4.8" % "test",
		"org.specs2" %% "specs2" % "1.4"  % "test->default"      
)