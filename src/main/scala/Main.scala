import zio.App
import zio.console._
import zio._

object MyApp extends App {

  def run(args: List[String]) =
    myAppLogic.repeat(Schedule.recurs(2)).fold(_ => 1, _ => 0)

  val myAppLogic =
    for {
      _    <- putStrLn("Write a list of comma seperated numbers:")
      strValues <- getStrLn
      intValues = strValues.split(",").toList.flatMap(_.toIntOption)
      _    <- putStrLn(s"The answer is: ${solve(intValues)}")

    } yield ()
}