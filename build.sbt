

name := "Html Reports"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.0"

testOptions in Test +=Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports")

testOptions in Test +=Tests.Cleanup((loader:java.lang.ClassLoader)=>{loader.loadClass("report.creator.HtmlReport").newInstance})