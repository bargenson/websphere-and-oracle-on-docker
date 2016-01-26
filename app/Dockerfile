FROM            websphere-liberty:javaee7
MAINTAINER      Brice Argenson <brice@clevertoday.com>

COPY            ojdbc6.jar              /config/lib/ojdbc6.jar
COPY            server.xml              /config/server.xml
COPY            target/bnc-demo.war     /config/dropins/bnc-demo.war
