The framework provides a ready to setup scala test framework with html reports and a zip file containing html reports for the test suites.
The index.html file is for overall test suite results with a pie-chart result also.
   
Prerequisites-

jre --version-7 or above
sbt --version-.13 or above
scala --version-2.10.4 or above(kindly change build.sbt for changing the version)  

Zipping the html files-

Change below line- 
testOptions in Test +=Tests.Cleanup((loader:java.lang.ClassLoader)=>{loader.loadClass("report.creator.HtmlReport").newInstance})  

in build.sbt with-

testOptions in Test +=Tests.Cleanup((loader:java.lang.ClassLoader)=>{loader.loadClass("report.creator.HtmlReportInZip").newInstance})

Running the test:-

Simply write sbt test in bash or command shell

Or goto http://www.scala-sbt.org/0.13.5/docs/Detailed-Topics/Testing.html for more options

Reports path:-

{basepath}/target/test-reports
