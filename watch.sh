#!/usr/bin/env bash

# watch the java files and continously deploy the service
mvn clean install
reflex -r "\.java$" -- bash -c 'mvn install'
