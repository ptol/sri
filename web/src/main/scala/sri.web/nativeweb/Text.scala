package sri.web.nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U}

case class Text(style: U[js.Any] = js.undefined,
                onPress: U[(js.Dynamic) => Unit] = js.undefined,
                component: U[String] = js.undefined,
                children: U[js.Any] = js.undefined,
                numberOfLines: U[Int] = js.undefined,
                testID: U[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    val f = React.createFactory(ReactNativeWeb.Text)
    f(props, children: _*).asInstanceOf[ReactElement]
  }

}