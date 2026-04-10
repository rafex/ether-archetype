# Makefile for ${rootArtifactId}
# Requires: Maven 3.9+, Java ${javaVersion}+

MVN := ./mvnw

.PHONY: help build test clean format format-check quality install install-full package run

help:
	@echo ""
	@echo "Available targets:"
	@echo "  build         Compile all modules"
	@echo "  test          Run unit tests"
	@echo "  clean         Remove build artifacts"
	@echo "  format        Apply Spotless code formatting"
	@echo "  format-check  Check Spotless formatting (no modifications)"
	@echo "  quality       Full quality checks (spotless, checkstyle, owasp)"
	@echo "  install       Install all modules to local Maven repo (skip tests)"
	@echo "  install-full  Install with tests"
	@echo "  package       Package transport-jetty as fat jar"
	@echo "  run           Package and run the application"
	@echo ""

build:
	$(MVN) compile

test:
	$(MVN) test

clean:
	$(MVN) clean

format:
	$(MVN) spotless:apply

format-check:
	$(MVN) spotless:check

quality:
	$(MVN) -Pquality verify

install:
	$(MVN) clean install -DskipTests

install-full:
	$(MVN) clean install

package:
	$(MVN) clean package -pl ${rootArtifactId}-transport-jetty -am

run: package
	java -jar ${rootArtifactId}-transport-jetty/target/${rootArtifactId}-transport-jetty-${version}-jar-with-dependencies.jar
