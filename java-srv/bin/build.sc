import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.slf4j:slf4j-log4j12:1.7.5",
ivy"org.slf4j:slf4j-api:1.7.5",
ivy"org.postgresql:postgresql:42.2.18.jre7",
ivy"org.hibernate:hibernate-core:${hibernateVersion}",
ivy"org.glassfish.jaxb:jaxb-runtime:${jaxbVersion}",
ivy"log4j:log4j:1.2.17",
ivy"jakarta.xml.bind:jakarta.xml.bind-api:${jaxbVersion}"
    // Dependices
  )
}
