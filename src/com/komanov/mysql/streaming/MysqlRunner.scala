package com.komanov.mysql.streaming

import com.wix.mysql.EmbeddedMysql
import com.wix.mysql.EmbeddedMysql._
import com.wix.mysql.config.MysqldConfig._
import com.wix.mysql.config.SchemaConfig._
import com.wix.mysql.config.{Charset, DownloadConfig}
import com.wix.mysql.distribution.Version

object MysqlRunner {

  private lazy val mysql: EmbeddedMysql = {
    val config = aMysqldConfig(Version.v5_7_latest)
      .withPort(Drivers.Port)
      .withUser(Drivers.UserName, Drivers.Password)
      .withCharset(Charset.UTF8MB4)
      .withTempDir("/tmp/embedded-mysql-tmp")
      .withServerVariable("socket", "/tmp/embedded-mysql.sock")
      .build()

    val mysqld = anEmbeddedMysql(config)
      .withDownloadConfig(
        DownloadConfig.aDownloadConfig()
          .withCacheDir("/tmp/embedded-mysql")
          .build()
      )
      .start()

    mysqld.addSchema(
      aSchemaConfig(Drivers.DataBase)
        .withCommands(Query.CreateSql)
        .build()
    )

    mysqld
  }

  def run(): Unit = {
    mysql.toString
  }

}
