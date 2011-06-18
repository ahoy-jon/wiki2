
import sbt._

class MyProject(info: ProjectInfo) extends DefaultWebProject(info) with AkkaProject  {
   val snapshots = "snapshots" at "http://scala-tools.org/repo-snapshots"
   val releases  = "releases" at "http://scala-tools.org/repo-releases"
   
 
  override val jettyPort = 9000
  

  override def libraryDependencies = Set(
    "commons-configuration" % "commons-configuration" % "1.6",
    "com.vaadin" % "vaadin" % "6.4.0",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "org.specs2" %% "specs2" % "1.4"  % "test->default"
  ) ++ super.libraryDependencies
  
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)
}
