package controllers

/**
  * Created by Vivek on 11/24/2016.
  */
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import models.Stock

@Singleton
class XmlController @Inject extends Controller {

  def create = Action {
    val stock = Stock("GOO", 10)
    Ok(Json.toJson(stock))
  }

  def save = Action {
    request =>
      val json = request.body.asJson.get
      val stock = json.as[Stock]
      Ok(Json.toJson(stock))
  }

}
