package quanter.actors.trade

import akka.actor.{Actor, Props}
import quanter.trade.TTrade

/**
  *
  */
object TradeActor {
  def props(trade: TTrade): Props = {
    Props(classOf[TradeActor], trade)
  }
}
class TradeActor(trade: TTrade) extends Actor{


  @scala.throws[Exception](classOf[Exception])
  override def preStart(): Unit = {
    super.preStart()
    // TODO: 每间隔3s 刷新, 保持交易通道连接
  }

  override def receive: Receive = ???

  private def _buy(): Unit = {

  }

  private def _sell(): Unit = {

  }
}
