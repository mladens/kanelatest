import akka.actor.ActorSystem
import kamon.Kamon

object Main extends App {
  Kamon.init()
  ActorSystem("dasdasd")
}
