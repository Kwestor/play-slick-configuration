package org.virtuslab.config

import play.api.db.slick.Config.driver.simple._

/**
 * Entity for keeping basic configuration in DB.
 *
 * @author Krzysztof Romanowski
 */
private[config] case class ConfigurationEntry(key: String, value: String)

/**
 * DB table for configuration.
 */
object ConfigurationEntries extends Table[ConfigurationEntry]("configuration") {

  def key = column[String]("key", O.PrimaryKey)

  def value = column[String]("value")

  def * = key ~ value <> (ConfigurationEntry.apply _, ConfigurationEntry.unapply _)

}
