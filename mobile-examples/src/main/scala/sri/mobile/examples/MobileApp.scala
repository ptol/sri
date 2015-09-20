package sri.mobile.examples

import sri.mobile._
import sri.mobile.examples.uiexplorer.UIExplorerApp

import scala.scalajs.js.JSApp


object MobileApp extends JSApp {


  def main() = {

    val root = createMobileRoot(
//                  HelloSriMobile()
//                  RouterExample.routerElement
      UIExplorerApp.router
//      MoviesApp.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}