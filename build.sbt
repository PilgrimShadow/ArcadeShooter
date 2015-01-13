import scala.scalajs.sbtplugin.ScalaJSPlugin._
import com.lihaoyi.workbench.Plugin._

scalaJSSettings

workbenchSettings

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
)

bootSnippet := "ArcadeShooter.main(document.getElementById('canvas'));"

updateBrowsers <<= updateBrowsers.triggeredBy(ScalaJSKeys.fastOptJS in Compile)

